package com.cg.ppmtoolapi.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ppmtoolapi.domain.Backlog;
import com.cg.ppmtoolapi.domain.Project;
import com.cg.ppmtoolapi.exception.ProjectIdException;
import com.cg.ppmtoolapi.repository.BacklogRepository;
import com.cg.ppmtoolapi.repository.ProjectRepository;
import com.cg.ppmtoolapi.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	Logger logger = LoggerFactory.getLogger(ProjectServiceImpl.class);
	

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private BacklogRepository backlogRepository;

	@Override
	public Project saveOrUpdate(Project project) {

		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			//1. when project is getting created first time, than backlog should be created along with that.
			if(project.getId()==null) {
				Backlog backlog=new Backlog();
				project.setBacklog(backlog);
				backlog.setProject(project);
				backlog.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());				
			}
			//2. in case of updating the project, backlog should not be null, same projectIdentifier should be set in backlog.
			if(project.getId()!=null) {
				project.setBacklog(backlogRepository.findByProjectIdentifier(project.getProjectIdentifier().toUpperCase()));
			}
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
