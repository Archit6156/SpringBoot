package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	private String title;
	private String description;
	private String instructorName;
	private long durationInHours;
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", instructorName="
				+ instructorName + ", durationInHours=" + durationInHours + ", getId()=" + getId() + ", getTitle()="
				+ getTitle() + ", getDescription()=" + getDescription() + ", getInstructorName()=" + getInstructorName()
				+ ", getDurationInHours()=" + getDurationInHours() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	public long getId() {
		return id;
	}

	

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
	
	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public long getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(long durationInHours) {
		this.durationInHours = durationInHours;
	}

	//Default Constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructor
	public Course(long id, String title, String description, String instructorName, long durationInHours) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.instructorName = instructorName;
		this.durationInHours = durationInHours;
	}



	

}
