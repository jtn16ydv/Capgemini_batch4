package com.cg.ppmtoolapi.web;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ppmtoolapi.domain.Project;
import com.cg.ppmtoolapi.exception.ProjectIdException;
import com.cg.ppmtoolapi.service.MapValidationErrorService;
import com.cg.ppmtoolapi.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	Logger logger = LoggerFactory.getLogger(ProjectController.class);

	@Autowired
	private ProjectService projectService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	@PostMapping
	public ResponseEntity<?> createProject(@Valid @RequestBody Project project, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		Project createdProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(createdProject, HttpStatus.CREATED);
	}
	
	@GetMapping("/{projectIdentifier}")
	public ResponseEntity<Project> getProjectByProjectIdentifier(@PathVariable String projectIdentifier){
		Project project = projectService.findProjectByProjectIdentifier(projectIdentifier);
		logger.info("--PROJECT--"+project);
		if(project==null) {
			throw new ProjectIdException("Project Id "+projectIdentifier.toUpperCase()+" does not exist");
		}
		return new ResponseEntity<Project>(project, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Project> getAllProjects(){
		return projectService.findAllProjects();
	}
	
	@DeleteMapping("/{projectIdentifier}")
	public ResponseEntity<?> deleteProject(@PathVariable String projectIdentifier){
		projectService.deleteProjectByProjectIdentifier(projectIdentifier);
		return new ResponseEntity<String>("Project With id : "+projectIdentifier.toUpperCase()+" is deleted successfully",HttpStatus.OK);
	}

}
