package com.wissen.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity	
@Table(name= "Employee_Group")
public class Group {

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long groupId;
	
	@Column(name = "GROUP_EMAIL")
	private String groupEmail;
	
	@OneToOne
	private Employee groupAdmin;
	
	@ManyToOne(cascade={CascadeType.ALL})
	private Employee emp;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getGroupEmail() {
		return groupEmail;
	}

	public void setGroupEmail(String groupEmail) {
		this.groupEmail = groupEmail;
	}

	public Employee getGroupAdmin() {
		return groupAdmin;
	}

	public void setGroupAdmin(Employee groupAdmin) {
		this.groupAdmin = groupAdmin;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
