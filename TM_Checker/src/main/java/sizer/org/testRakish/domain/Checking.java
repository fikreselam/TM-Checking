package sizer.org.testRakish.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Checking {

	@Id
	@GeneratedValue
	private long id;
	private String time;

	@Temporal(TemporalType.DATE)
	private Date date;
	private int noOf_checking;
	private String status;

	@OneToOne(cascade = CascadeType.ALL)
	private Student student;

	@ManyToOne(cascade = CascadeType.ALL)
	private Instructor instructor;

	public Checking() {
	}

	public Checking(Student student, Instructor instructor) {
		this.student = student;
		this.instructor = instructor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getNoOf_checking() {
		return noOf_checking;
	}

	public void setNoOf_checking(int noOf_checking) {
		this.noOf_checking = noOf_checking;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

}
