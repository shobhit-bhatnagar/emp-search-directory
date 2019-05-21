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
	
	@Id
	@Column(name="EMPLOYEE_ID")
	
	private String employeeId;
	
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Set<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public List<Group> getGroup() {
		return group;
	}

	public void setGroup(List<Group> group) {
		this.group = group;
	}

	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="manager_id")
	private Employee manager;

	@OneToMany(mappedBy="manager")
	private Set<Employee> subordinates = new HashSet<Employee>();

	@Column(name = "EMAIL_ID")
	private String emailID;
	
	
	@OneToMany
	@JoinColumn(name = "EMPLOYEE_ID")
	private List<Group> group = new ArrayList<>();
	
	public Employee() {
	}

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
		
	// Getter and Setter methods
}
