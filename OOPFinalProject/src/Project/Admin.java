package Project;
import java.util.Optional;
import java.util.Vector;
import Enums.*;import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Optional;
import java.util.Vector;
import java.util.Map.Entry;
import Project.Action;
import Project.Database;

import Enums.Language;
import Project.User;

@SuppressWarnings("unused")
public class Admin extends User {
	private static Vector<Action> logFiles;
	
	public Admin(String id, String password, String firstName, String lastName, String userInfo, int age,
			boolean status, Language language, boolean isLoggedIn) {
		super(id, password, firstName, lastName, userInfo, age, status, language, isLoggedIn);
		
	}
	
	
	public Vector<Action> getLogFiles() {
		return logFiles;
	}
	public void setLogFiles(Action action) {
		Admin.logFiles.add(action);
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


	public static User search(String id) {
		for(Entry <TypeUser, HashSet <User> > e: Database.users.entrySet()) {
			Optional <User> optional = e.getValue().stream().filter(n -> n.getId().equals(id)).findFirst();
			if(optional.isPresent()) {User u = optional.get(); return u;}
		}
		return null;
	}
	
	public void updatePassword(String id, String newPassword) {
		search(id).setPassword(newPassword); 
	}

	public void removeUser(String id) {
		User u = search(id);
		String userType = u.getClass().getName().substring(6).toUpperCase();
		Database.users.get(Enums.TypeUser.valueOf(userType)).remove(u);
	}

	public void blockUser(String id) {
			search(id).setStatus(false);
	}
	public boolean viewRequest(Request request) throws IOException {
	    boolean found = false;
	    String requestType = request.getContent().split(" ")[0];
	    String requestMess = request.getContent().substring(requestType.length()).trim(); 

	    for (TypeUser tu : Database.users.keySet()) {
	        for (User u : Database.users.get(tu)) {
	            if (u.getId().equals(request.getSender().getId())) {
	                found = true;
	                if (requestType.toLowerCase().equals("cp")) u.setPassword(requestMess);
	                if (requestType.toLowerCase().equals("bu")) u.setStatus(false);
	                if (requestType.toLowerCase().equals("unl")) u.setStatus(true);
	                if (requestType.toLowerCase().equals("rem")) removeUser(u.getId());
	            }
	        }
	    }
	    Database.serializeUsers();
	    return found;
	}
	public static void serilaizeLogFiles() throws IOException {
	    try {
	      FileOutputStream fos = new FileOutputStream("logFiles.txt");
	      ObjectOutputStream log = new ObjectOutputStream(fos);
	      log.writeObject(logFiles); log.flush(); log.close(); fos.close();
	    } 
	    catch(Exception e) {e.getStackTrace();}
	}
	@SuppressWarnings("unchecked")
	public static Vector<Action> deserializeLogFiles() throws IOException, ClassNotFoundException {
	    try {
	      FileInputStream fis = new FileInputStream("logFiles.txt");
	      ObjectInputStream log = new ObjectInputStream(fis);
	      logFiles = (Vector<Action>) log.readObject();
	      log.close(); fis.close(); 
	    } 
	    catch(Exception e) {e.getStackTrace();}
	    
	    return logFiles;
	}
	
}
