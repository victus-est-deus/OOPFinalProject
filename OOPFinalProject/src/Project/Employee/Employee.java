package Project.Employee;
import java.util.Date;
import java.util.Vector;

import Enums.Language;
import Project.User;

public abstract class Employee extends User {
    // Additional fields
    private Date hireDate;
    private Vector<Message> myMessages; // Assuming Messages is a class you've defined

    // Constructor
    public Employee(String id, String password, String firstName, String lastName, 
                    String userInfo, int age, boolean status, Language language, 
                    Date hireDate, Vector<Message> myMessages) {
        super(id, password, firstName, lastName, userInfo, age, status, language);
        this.hireDate = hireDate;
        this.myMessages = myMessages;
    }

    // Getters
    public Date getHireDate() {
        return hireDate;
    }

    public Vector<Message> getMyMessages() {
        return myMessages;
    }

    // Setters
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setMyMessages(Vector<Message> myMessages) {
        this.myMessages = myMessages;
    }

    // Additional methods
    public abstract void sendMessage();

    public abstract void viewMessage();

   
}

