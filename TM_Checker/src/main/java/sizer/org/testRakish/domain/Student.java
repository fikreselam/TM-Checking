package sizer.org.testRakish.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private long id;	
	private String pass;
	private String email;
	
	@OneToOne(mappedBy="student", cascade=CascadeType.ALL)
	private Checking checking;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person person;
	
	public Student(){}
	
	public Student(long id,String pass,String email, Person person){
		this.id=id;
		this.pass=pass;
		this.email=email;
		this.person=person;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
	
	

}
