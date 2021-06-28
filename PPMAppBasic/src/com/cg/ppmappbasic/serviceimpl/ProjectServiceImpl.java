package com.cg.ppmappbasic.serviceimpl;

import java.util.List;

import com.cg.ppmappbasic.dao.ProjectDAO;
import com.cg.ppmappbasic.daoimpl.ProjectDAOImpl;
import com.cg.ppmappbasic.domain.Project;
import com.cg.ppmappbasic.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	
	private ProjectDAO projectDAO;
	
	public ProjectServiceImpl() {
		projectDAO=new ProjectDAOImpl();
	}

	@Override
	public void createProject(Project project) {
		projectDAO.save(project);

	}

	@Override
	public List<Project> listProjects() {
		
		return projectDAO.findAll();
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProject(int id) {
		// TODO Auto-generated method stub

	}

}
