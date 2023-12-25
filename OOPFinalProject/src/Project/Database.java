package Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import Project.Student.*;
import Project.Employee.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.Map.Entry;
import Enums.*;


public class Database {
    // Fields
//    private List<User> users;
//    private Vector<Request> requests;
////    private HashSet<ResearchProject> researches;
//    private HashSet<Course> courses;
//    private HashMap<String, Vector<News>> news;
//    private Vector<Organization> organizations;
//    private HashMap<Employee, Message> message;
	public static HashMap <TypeUser, HashSet <User> > users = new HashMap <>();
    public static HashSet <Course> courses = new HashSet <>();
    public static Vector <Request> requests = new Vector <>();
	public static HashMap <String , Vector <News> > news = new HashMap <>();
	public final static Map <Degree, String> idStudDegree;
	public static Vector <Organization> organizations = new Vector<>();
	
	static {
		idStudDegree = new HashMap<>();
		idStudDegree.put(Degree.BACHELOR, "BD");
		idStudDegree.put(Degree.MASTER, "MD");
		idStudDegree.put(Degree.PhD, "PD");
		
		HashSet <User> students = new HashSet <User>();
		HashSet <User> teachers = new HashSet <User>();
		HashSet <User> admin = new HashSet <User>();
		HashSet <User> deans = new HashSet <User>();
		HashSet <User> managers = new HashSet <User>();
		HashSet <User> librarian = new HashSet <User>();
		HashSet <User> rector = new HashSet<User>();
//		admin.add(Admin.getAdmin());
		Database.users.put(TypeUser.TEACHER, teachers);
		Database.users.put(TypeUser.STUDENT, students);
		Database.users.put(TypeUser.DEAN, deans);
		Database.users.put(TypeUser.ADMIN, admin);
		Database.users.put(TypeUser.MANAGER, managers);
		Database.users.put(TypeUser.LIBRARIAN, librarian);
		Database.users.put(TypeUser.RECTOR, rector);
		
		Database.news.put("Official", new Vector<News>() );
		Database.news.put("Upcoming events", new Vector<News>() );
		Database.news.put("Lost and found", new Vector<News>() );


	}
    // Methods for serialization and deserialization
	public static void serilaizeUsers() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("users.out");
			ObjectOutputStream user = new ObjectOutputStream(fos);
			user.writeObject(users);
			user.flush();
			user.close();
			fos.close();
		} 
		catch(Exception e) {e.getStackTrace();}
    }
	
	@SuppressWarnings("unchecked")
	public static HashMap <TypeUser, HashSet <User> > deserializeUsers() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("users.out");
			ObjectInputStream user = new ObjectInputStream(fis);
			users = (HashMap <TypeUser, HashSet <User> >)user.readObject();
			user.close();
			fis.close();
		} 
		catch(Exception e) {e.getStackTrace();}
		
		return users;
	}

    public void serializeRequests() {
        // Logic to serialize requests
    }

    public void deserializeRequests() {
        // Logic to deserialize requests
    }

    public void serializeCourses() {
        // Logic to serialize courses
    }

    public void deserializeCourses() {
        // Logic to deserialize courses
    }

    public void serializeNews() {
        // Logic to serialize news
    }

    public void deserializeNews() {
        // Logic to deserialize news
    }

    public void serialized() {
        // Additional serialization logic
    }

    public void deserialized() {
        // Additional deserialization logic
    }

    // Method to show all users
 
}

