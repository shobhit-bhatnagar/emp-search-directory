package com.wissen.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.wissen.model.Group;

public class Employee {
	

	private String emailID;
	
	
	
	private String employeeId;
	
	
	private String firstname;
	
	
	private List<Long> group = new ArrayList<>();

	
	private String imageURL;

	
	private String lastname;
	
	
	private String manager_id;
	
	private Set<String> subordinates = new HashSet<String>();

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public List<Long> getGroup() {
		return group;
	}

	public void setGroup(List<Long> group) {
		this.group = group;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public Set<String> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<String> subordinates) {
		this.subordinates = subordinates;
	}
}
	
