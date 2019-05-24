package com.wissen.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="EMPLOYEE")
@Entity

public class Employee {
	
	@Column(name = "EMAIL_ID")
	private String emailID;
	
	
	@Id
	@Column(name="EMPLOYEE_ID")
	
	private String employeeId;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@OneToMany
	@JoinColumn(name = "EMPLOYEE_ID")
	private List<Group> group = new ArrayList<>();

	@Column(name = "IMAGE_URL")
	private String imageURL;

	@Column(name="LASTNAME")
	private String lastname;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="manager_id")
	private Employee manager;
	
	
	
	@OneToMany(mappedBy="manager")
	private Set<Employee> subordinates = new HashSet<Employee>();
	
	public Employee() {
	}

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getEmailID() {
		return emailID;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public List<Group> getGroup() {
		return group;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getLastname() {
		return lastname;
	}

	public Employee getManager() {
		return manager;
	}

	public Set<Employee> getSubordinates() {
		return subordinates;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setGroup(List<Group> group) {
		this.group = group;
	}

	
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
		
	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}

}
