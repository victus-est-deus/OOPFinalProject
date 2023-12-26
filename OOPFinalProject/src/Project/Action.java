package Project;

import java.util.Date;

public class Action {
	Date date;
    User executor;
    String action;
    
    public Action() {
    	
    }
    
    public Action(Date date, User user, String action) {
    	super();
    	this.date = date;
    	this.executor = user;
    	this.action = action;
    } 
    
	@Override
	public String toString() {
		return "Date = " + date + ", executor = " + executor + ", action = " + action + "\n";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getExecutor() {
		return executor;
	}

	public void setExecutor(User user) {
		this.executor = user;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
