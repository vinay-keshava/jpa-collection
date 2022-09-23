package com.sample.jpaCollection;

import javax.persistence.Embeddable;

@Embeddable
public class Branch {
	private String Brname;
	private int capacity;
	private int noOfFaculty;

	public String getName() {
		return Brname;
	}

	public void setName(String name) {
		this.Brname = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNoOfFaculty() {
		return noOfFaculty;
	}

	public void setNoOfFaculty(int noOfFaculty) {
		this.noOfFaculty = noOfFaculty;
	}

}
