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


@SuppressWarnings("unused")
public class Database {
    // Fields
    public static HashMap <TypeUser, HashSet <User> > users = new HashMap <>();
    public static HashSet <Course> courses = new HashSet <>();
    public static Vector <Request> requests = new Vector <>();
	public static HashMap <String , Vector <News> > news = new HashMap <>();
	public final static Map <Degree, String> idStudDegree;
	public static Vector <Organization> organizations = new Vector<>();
	public static Vector<Message> messages = new Vector<>();
	
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
	public static void serializeUsers() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("users.txt");
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
			FileInputStream fis = new FileInputStream("users.txt");
			ObjectInputStream user = new ObjectInputStream(fis);
			users = (HashMap <TypeUser, HashSet <User> >)user.readObject();
			user.close();
			fis.close();
		} 
		catch(Exception e) {e.getStackTrace();}
		
		return users;
	}

	public static void serilaizeRequests() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("requests.txt");
			ObjectOutputStream request = new ObjectOutputStream(fos);
			request.writeObject(requests); request.flush(); request.close();
			fos.close();
		} 
		catch(Exception e) {e.getStackTrace();}
    }
	@SuppressWarnings("unchecked")
	public static Vector <Request> deserializeRequests() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("requests.txt");
			ObjectInputStream request = new ObjectInputStream(fis);
			requests = (Vector <Request>)request.readObject();
			request.close(); fis.close();
		} 
		catch(Exception e) {e.getStackTrace();}
		
		return requests;
	}

    public void serializeCourses() {
        // Logic to serialize courses
    }

    public void deserializeCourses() {
        // Logic to deserialize courses
    }

    public static void serilaizeNews() throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream("news.txt");
			ObjectOutputStream newsList = new ObjectOutputStream(fos);
			newsList.writeObject(news);
			newsList.flush();
			newsList.close();
			fos.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
    }
	@SuppressWarnings("unchecked")
	public static HashMap <String , Vector<News> > deserializeNews() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("news.txt");
			ObjectInputStream newsList = new ObjectInputStream(fis);
			news = (HashMap <String , Vector<News> >) newsList.readObject();
			newsList.close();
			fis.close();
			
		} catch(Exception e) {
			e.getStackTrace();
		}
		return news;
	}

	public static void SerializeAll() throws IOException {
		serializeUsers();
//		serilaizeCourses();
		serilaizeNews();
		serilaizeRequests();
		Admin.serilaizeLogFiles();
//		serilaizeOraganizations();
	}

	public static void DeserializeAll() throws ClassNotFoundException, IOException {
		Database.deserializeUsers();
//		Database.deserializeCourses();
		Database.deserializeNews();
		Database.deserializeRequests();
		Admin.deserializeLogFiles();
//		deserializeOraganizations();
	}
    public static void serializeMessages() throws IOException {
        try (FileOutputStream fos = new FileOutputStream("messages.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(messages);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
	public static void deserializeMessages() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("messages.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            messages = (Vector<Message>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
 
}

