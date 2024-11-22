package com.university.management;

public class Course {
	private String title;
	
	public Course(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + "]";
	}
	
	}
	

