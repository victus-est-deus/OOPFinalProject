package Project.Student;
import Enums.*;
import Project.User;
import java.util.Vector;

public class Student extends User {
    // Fields
    private Degree degree;
    private Faculty faculty;
    private int year;
    private double GPA;
    private Vector<Course> courses;
    private String transcript;
    private String journal;
    private Organization organization;

    // Constructor
    public Student(String id, String password, String firstName, String lastName, 
                   String userInfo, int age, boolean status, Language language,boolean isLoggedIn, 
                   Degree degree, Faculty faculty, int year, double GPA, 
                   Vector<Course> courses, String transcript, String journal, 
                   Organization organization) {
        super(id, password, firstName, lastName, userInfo, age, status, language,isLoggedIn);
        this.degree = degree;
        this.faculty = faculty;
        this.year = year;
        this.GPA = GPA;
        this.courses = courses;
        this.transcript = transcript;
        this.journal = journal;
        this.organization = organization;
    }

    // Getters and Setters
    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }


    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

	@Override
	public void viewMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewNews() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doResearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendRequest() {
		// TODO Auto-generated method stub
		
	}

	public void viewInfo() {
        // Logic to view student's information
    }

    public String getTranscript() {
        // Logic to return the transcript
        return transcript;
    }

    public void registerToCourse() {
        // Logic to register for a course
    }

    public void joinOrganization() {
        // Logic to join an organization
    }

    public void leaveOrganization() {
        // Logic to leave an organization
    }

    public void createOrganization() {
        // Logic to create a new organization
    }

    public void rateTeachers() {
        // Logic for rating teachers
    }
}

