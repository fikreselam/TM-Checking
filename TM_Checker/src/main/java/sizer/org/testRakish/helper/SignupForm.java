package sizer.org.testRakish.helper;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SignupForm {
	
	private String time;
	private Date date;
	private List<String> timeList= Arrays.asList("AM","PM");
	
	
	
	public List<String> getTimeList() {
		return timeList;
	}
	public void setTimeList(List<String> timeList) {
		this.timeList = timeList;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	
	
	
}
