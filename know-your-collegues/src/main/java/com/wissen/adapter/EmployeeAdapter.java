package com.wissen.adapter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.wissen.model.Group;
import com.wissen.view.Employee;

public class EmployeeAdapter  {

	private com.wissen.model.Employee emp = null;
	
	public EmployeeAdapter(com.wissen.model.Employee employee)
	{
		this.emp = employee;
	}
	
	
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		
		emp.setFirstname(this.emp.getFirstname());
		emp.setLastname(this.emp.getLastname());
		emp.setEmailID(this.emp.getEmailID());
		emp.setImageURL(this.emp.getImageURL());
		emp.setManager_id(this.emp.getManager()==null?null:this.emp.getManager().getEmployeeId());
		emp.setEmployeeId(this.emp.getEmployeeId());
		
		List<Long> list = new ArrayList<>();
		for(Group group : this.emp.getGroup())
		{
			list.add(group.getGroupId());
		}
		
		emp.setGroup(list);
		
		Set<String> subO = new HashSet<String>();
		
		for(com.wissen.model.Employee sub : this.emp.getSubordinates())
		{
			subO.add(sub.getEmployeeId());
		}
		
		emp.setSubordinates(subO);
		
		return emp;
	}
}
