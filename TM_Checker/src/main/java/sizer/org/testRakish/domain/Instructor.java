package sizer.org.testRakish.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Instructor {

	@Id
	@GeneratedValue
	private long id;
	private String insId;
	private String password;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person person;
	
	@OneToMany
	private List<Checking> Ins_checking=new ArrayList<Checking>();
	
	@OneToOne(mappedBy="ins",cascade=CascadeType.ALL)
	private Event announcment;

	public Instructor(){}
	
	
	public Instructor(String insId,String password,String email,Person person){
		this.insId=insId;
		this.password=password;
		this.email=email;
		this.person=person;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInsId() {
		return insId;
	}

	public void setInsId(String insId) {
		this.insId = insId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		
	public List<Checking> getIns_checking() {
		return Ins_checking;
	}

	public void setIns_checking(List<Checking> ins_checking) {
		Ins_checking = ins_checking;
	}


	public Event getAnnouncment() {
		return announcment;
	}


	public void setAnnouncment(Event announcment) {
		this.announcment = announcment;
	}


	public void setId(long id) {
		this.id = id;
	}

	
	
	
	
	
}
