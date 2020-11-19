package com.lti.demo;

public class Person {
	
	private String personName;
	private int personAge;
	private double personScore;
	
	public Person(String personName, int personAge, double personScore) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personScore = personScore;
	}
	public double getPersonScore() {
		return personScore;
	}
	public void setPersonScore(double personScore) {
		this.personScore = personScore;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public Person(String personName, int personAge) {
		super();
		this.personName = personName;
		this.personAge = personAge;
	}
	
	

}
