package sizer.org.testRakish.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private long id;
	private String fristName;
	private String lastName;
	private String role;
	
	
	public Person(String firstName,String lastName,String role){
		this.fristName=firstName;
		this.lastName=lastName;
		this.role=role;
	}
	
	public Person(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
