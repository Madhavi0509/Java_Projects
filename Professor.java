package com.university.management;

import java.util.ArrayList;
import java.util.List;

public class Professor {
private String name;
private List<Course>assignedCourses;

public Professor(String name) {
	this.name = name;
	this.assignedCourses = new ArrayList<>();
}
public void assignCourse(Course course) {
	if (!assignedCourses.contains(course)) {
		assignedCourses.add(course);
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Course> getAsssignedCourses() {
	return assignedCourses;
}

public void setAsssignedCourses(List<Course> asssignedCourses) {
	this.assignedCourses = asssignedCourses;
}

}
