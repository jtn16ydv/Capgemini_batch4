package com.cg.ppmtoolapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ppmtoolapi.domain.Backlog;
import com.cg.ppmtoolapi.domain.ProjectTask;
import com.cg.ppmtoolapi.exception.ProjectNotFoundException;
import com.cg.ppmtoolapi.repository.BacklogRepository;
import com.cg.ppmtoolapi.repository.ProjectTaskRepository;
import com.cg.ppmtoolapi.service.ProjectTaskService;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {
	@Autowired
	private BacklogRepository backlogRepository;
	@Autowired
	private ProjectTaskRepository projectTaskRepository;

	@Override
	public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask) {
		try {
//			- ExceptionHandling : When project not found
//			- ProjectTasks to be added to a specific Project, project!=null, backlog exist
			Backlog backlog=backlogRepository.findByProjectIdentifier(projectIdentifier);
//			- Set the backlog to a project Task
			projectTask.setBacklog(backlog);
//			- We want our project sequence to be like :  FP01-1, FP01-2
			Integer backlogSequence =  backlog.getPTSequence();
			backlogSequence++;
			
//			- Update the backlog sequence back in backlog
			backlog.setPTSequence(backlogSequence);
//			- Add sequence to the project task
			projectTask.setProjectSequence(projectIdentifier+"-"+backlogSequence);
//			- Initial priority when priority is null
			if(projectTask.getPriority()==null) {
				projectTask.setPriority(ProjectTaskService.PRIORITY_LOW); 
			}
			
//			- Initial status when the status is null
			if(projectTask.getStatus()=="" || projectTask.getStatus()==null) {
				projectTask.setStatus(ProjectTaskService.TO_DO);
			}
			return projectTaskRepository.save(projectTask);
		}catch(Exception ex) {
			throw new ProjectNotFoundException("Project Not Found");
		}
	}

	@Override
	public ProjectTask findPTByProjectSequence(String backlog_id, String sequence) {
		// 1. we are searching on the right backlog_id
		Backlog backlog=backlogRepository.findByProjectIdentifier(backlog_id);
		if(backlog==null) {
			throw new ProjectNotFoundException("Project with id : '"+backlog_id+"' does not exist");
		}
		// 2. our task exists or not
		ProjectTask projectTask = projectTaskRepository.findByProjectSequence(sequence);
		if(projectTask==null) {
			throw new ProjectNotFoundException("ProjectTask with id : '"+sequence+"' does not exist");
		}
		// 3. backlog_id and sequence is from correct project
		//TODO Need to work on this
//		if(!projectTask.getProjectIdentifier().equals(backlog_id)) {
//			throw new ProjectNotFoundException("ProjectTask id : '"+sequence+"' does not exist in Project :'"+backlog_id+"'");
//		}
		return projectTask;
	}

	@Override
	public ProjectTask updateByProjectSequence(ProjectTask updatedProjectTask, String backlog_id, String sequence) {
		//Find existing ProjectTask
		ProjectTask projectTask = findPTByProjectSequence(backlog_id, sequence);
		//Replacing the ProjectTask with updatedProjectTask object cloing
		projectTask =  updatedProjectTask;
		//Save ProjectTask
		return projectTaskRepository.save(projectTask);
	}

	@Override
	public void deletePTByProjectSequence(String backlog_id, String sequence) {
		ProjectTask projectTask = findPTByProjectSequence(backlog_id, sequence);
		Backlog backlog = projectTask.getBacklog();
		List<ProjectTask> projectTasks =  backlog.getProjectTasks();
		projectTasks.remove(projectTask);
		backlogRepository.save(backlog);
		projectTaskRepository.delete(projectTask);		
	}

	

}
