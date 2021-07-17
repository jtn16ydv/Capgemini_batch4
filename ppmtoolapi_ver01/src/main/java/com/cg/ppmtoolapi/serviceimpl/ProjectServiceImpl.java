package com.cg.ppmtoolapi.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ppmtoolapi.domain.Project;
import com.cg.ppmtoolapi.exception.ProjectIdException;
import com.cg.ppmtoolapi.repository.ProjectRepository;
import com.cg.ppmtoolapi.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);
	

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveOrUpdate(Project project) {

		try {

			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());

			return projectRepository.save(project);
		} catch (Exception ex) {
			logger.info("--ERROR:503--"+ex.getMessage());
			throw new ProjectIdException("project id " + project.getProjectIdentifier() + " is already available");
		}
	}

	@Override
	public Project findProjectByProjectIdentifier(String projectIdentifier) {
		Project project =  projectRepository.findByProjectIdentifier(projectIdentifier);
		return project;
	}

	@Override
	public Iterable<Project> findAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	public void deleteProjectByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if(project==null) {
			throw new ProjectIdException("Can not delete project with project id "+projectIdentifier.toUpperCase()+". This id does not exist");
		}
		
		projectRepository.delete(project);
		
	}

	

}
