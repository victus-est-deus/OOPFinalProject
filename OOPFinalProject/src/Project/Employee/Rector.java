package Project.Employee;
import java.util.Date;
import java.util.Vector;

import Enums.Language;
import Enums.TypeUser;
import Project.Database;
import Project.User;

public class Rector extends Employee {

	public Rector(String id, String password, String firstName, String lastName, String userInfo, int age,
			boolean status, Language language, boolean isLoggedIn, Date hireDate, Vector<Message> myMessages) {
		super(id, password, firstName, lastName, userInfo, age, status, language, isLoggedIn, hireDate, myMessages);
		
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
	@SuppressWarnings("unused")
	public void conductDeansMeeting() {
        Date currentDate = new Date(); 
        String meetingContent = "You are invited to meeting";

        for (User user : Database.users.get(TypeUser.DEAN)) {
            Message meetingInvitation = new Message(currentDate, meetingContent, this); 
            
        }
    }
	

	

}
