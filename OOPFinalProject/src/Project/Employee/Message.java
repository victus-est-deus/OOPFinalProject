package Project.Employee;
import java.util.Date;
import Project.User;

public class Message {
    // Fields
    private Date dateStamp;
    private String content;
    private User sender; 
    // Constructor
    public Message(Date dateStamp, String content, User sender) {
        this.dateStamp = dateStamp;
        this.content = content;
        this.sender = sender;
    }

    // Getters
    public Date getDateStamp() {
        return dateStamp;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }

    // Setters
    public void setDateStamp(Date dateStamp) {
        this.dateStamp = dateStamp;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}

