package Project.Student;
import Enums.*;

import java.util.Date;

public class Attendence {
	private Date lessonTime;
	private AttendenceType attendence;
	
	public Attendence(Date lessonTime,AttendenceType attendence) {
		this.setLessonTime(lessonTime);
		this.setAttendence(attendence);
	}

	public Date getLessonTime() {
		return lessonTime;
	}

	public void setLessonTime(Date lessonTime) {
		this.lessonTime = lessonTime;
	}

	public AttendenceType getAttendence() {
		return attendence;
	}

	public void setAttendence(AttendenceType attendence) {
		this.attendence = attendence;
	}
	
}
