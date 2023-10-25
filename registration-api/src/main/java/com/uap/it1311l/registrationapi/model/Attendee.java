package com.uap.it1311l.registrationapi.model;

public class Attendee {
	public String attendeeId;
	public boolean setEligibility;
	public boolean isSetEligibility() {
		return setEligibility;
	}
	public void setSetEligibility(boolean setEligibility) {
		this.setEligibility = setEligibility;
	}
	public String getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(String attendeeId) {
		this.attendeeId = attendeeId;
	}
	public String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String middleName;
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String course;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
