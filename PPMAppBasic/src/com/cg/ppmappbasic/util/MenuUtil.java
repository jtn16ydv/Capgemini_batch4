package com.cg.ppmappbasic.util;

import java.util.List;
import java.util.Scanner;

import com.cg.ppmappbasic.domain.Project;
import com.cg.ppmappbasic.service.ProjectService;
import com.cg.ppmappbasic.serviceimpl.ProjectServiceImpl;

public class MenuUtil {
	
	private ProjectService projectService;
	
	public MenuUtil() {
		projectService=new ProjectServiceImpl();
	}
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		int optionChoice;
		String continueChoice;
		do {
			showMenu();
			System.out.println("Enter Your Choice : ");
			optionChoice = sc.nextInt();
			switch (optionChoice) {
			case 1:
				Project project = getProjectInput(sc);				
				projectService.createProject(project);
				break;
			case 2:
				System.out.println("--------Project List-----------");
				List<Project> projects = projectService.listProjects();
				for (Project prj : projects) {
					System.out.println(prj);
				}
				break;
			case 3:
				System.out.println("Updating   Project ");
				break;
			case 4:
				System.out.println("Deleting   Project ");
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice = sc.next();
		}while(continueChoice.equals("yes"));
	}

	private Project getProjectInput(Scanner sc) {
		Project project = new Project();
		System.out.println("Enter Project Name");
		project.setName(sc.next());
		System.out.println("Enter Project descrition");
		project.setDescription(sc.next());
		System.out.println("Enter Project ID");
		project.setPid(sc.next());
		return project;
	}

	private void showMenu() {
		System.out.println("-------PPM Menu--------");
		System.out.println("1. Create Project");
		System.out.println("2. List Projects");
		System.out.println("3. Update Projects");
		System.out.println("4. Delete Projects");
	}

}
