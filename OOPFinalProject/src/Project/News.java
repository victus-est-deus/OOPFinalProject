package Project;
import java.util.Date;

public class News {
	private String topic;
	private String content;
	private Date date;
	
	@SuppressWarnings("static-access")
	public News(String topic, String content, Date date) {
        this.topic = topic;
        this.content = content;
        this.date = this.currentDate();
    }

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
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
