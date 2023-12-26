package Project.Employee;
import Project.Employee.*;
import Project.Student.Course;

import java.util.Date;
import java.util.Vector;

import Enums.*;


@SuppressWarnings("unused")
public class Manager extends Employee {
	private ManagerPos managerPos;
	
	public Manager(String id, String password, String firstName, String lastName, 
            String userInfo, int age, boolean status, Language language,boolean isLoggedIn ,
            Date hireDate, Vector<Message> myMessages,ManagerPos managerPos) {
		super(id, password, firstName, lastName, userInfo, age, status, language,isLoggedIn, hireDate, myMessages);
		this.managerPos = managerPos;
}

	public ManagerPos getManagerPos() {
		return managerPos;
	}

	public void setManagerPos(ManagerPos managerPos) {
		this.managerPos = managerPos;
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendRequest() {
		// TODO Auto-generated method stub
		
	}
	public void addNews()
	{
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
