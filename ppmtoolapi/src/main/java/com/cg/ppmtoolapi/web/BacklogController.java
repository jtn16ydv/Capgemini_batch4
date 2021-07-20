package com.cg.ppmtoolapi.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ppmtoolapi.domain.ProjectTask;
import com.cg.ppmtoolapi.service.ProjectTaskService;
import com.cg.ppmtoolapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/backlog")
public class BacklogController {
	
	@Autowired
	private ProjectTaskService projectTaskService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/{backlog_id}")
	public ResponseEntity<?> addPTtoBacklog(@Valid @RequestBody ProjectTask projectTask, BindingResult result, @PathVariable String backlog_id){
		ResponseEntity<?> errorMap =  mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		ProjectTask createdProjectTask= projectTaskService.addProjectTask(backlog_id, projectTask);
		return new ResponseEntity<ProjectTask>(createdProjectTask, HttpStatus.CREATED);
	}
	
	@GetMapping("/{backlog_id}/{sequence}")
	public ResponseEntity<?> getProjectTask(@PathVariable String backlog_id,@PathVariable String sequence ){
		ProjectTask projectTask = projectTaskService.findPTByProjectSequence(backlog_id, sequence);
		return new ResponseEntity<ProjectTask>(projectTask,HttpStatus.OK);
		
	}
	
	@PatchMapping("/{backlog_id}/{sequence}")
	public ResponseEntity<?> updateProjectTask(@Valid @RequestBody ProjectTask projectTask, @PathVariable String backlog_id,@PathVariable String sequence, BindingResult result){
		ResponseEntity<?> errorMap =  mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		ProjectTask updatedProjectTask = projectTaskService.updateByProjectSequence(projectTask, backlog_id, sequence);
		return new ResponseEntity<ProjectTask>(updatedProjectTask,HttpStatus.OK);
	}
	
	@DeleteMapping("/{backlog_id}/{sequence}")
	public ResponseEntity<?> deleteProjectTask(@PathVariable String backlog_id,@PathVariable String sequence){
		projectTaskService.deletePTByProjectSequence(backlog_id, sequence);
		return new ResponseEntity<String>("Project Task '"+sequence+"' is deleted successfully ", HttpStatus.OK);
		
	}

}



