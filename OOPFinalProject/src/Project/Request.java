package Project;

import java.util.Date;

public class Request {
	private User sender;
	private String content;
	private Date date;
	
	@SuppressWarnings("static-access")
	public Request(User sender,String content,Date date) {
		this.sender = sender;
		this.content = content;
		this.date = this.currentDate();
	}
	
	
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static Date currentDate() {
        return new Date(); 
    }
	
}
