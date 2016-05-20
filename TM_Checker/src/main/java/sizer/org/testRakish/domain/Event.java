package sizer.org.testRakish.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
 

@Entity
public class Event {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String image;
	//private int liker;
	private String description;
	
	@OneToOne
	private Instructor ins;
	
	public Event(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

		
	 

	/*public int getLike() {
		return liker;
	}

	public void setLike(int liker) {
		this.liker = liker;
	}*/

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instructor getIns() {
		return ins;
	}

	public void setIns(Instructor ins) {
		this.ins = ins;
	}

	
	
	
}
