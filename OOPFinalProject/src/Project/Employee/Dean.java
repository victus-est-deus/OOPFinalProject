package Project.Employee;
import java.util.Date;
import java.util.Vector;

import Enums.*;
import Project.Database;
import Project.User;
import Project.Student.Student;

public class Dean extends Employee {
	private Faculty faculty;
	
	public Dean(String id, String password, String firstName, String lastName, String userInfo, int age, boolean status,
			Language language, boolean isLoggedIn, Date hireDate, Vector<Message> myMessages,Faculty faculty) {
		super(id, password, firstName, lastName, userInfo, age, status, language, isLoggedIn, hireDate, myMessages);
		this.setFaculty(faculty);
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
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
	public void viewTeacher() {
        for (User user : Database.users.get(TypeUser.TEACHER)) {
            Teacher teacher = (Teacher) user;
            System.out.println("ID: " + teacher.getId() + ", Name: " + teacher.getFirstName() + " " + teacher.getLastName() + ", Faculty: " + teacher.getFaculty());
           
        }
    }

    public void viewStudent() {
        for (User user : Database.users.get(TypeUser.STUDENT)) {
            Student student = (Student) user;
            System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + " " + student.getLastName() + ", Degree: " + student.getDegree());
            
        }
    }

}
