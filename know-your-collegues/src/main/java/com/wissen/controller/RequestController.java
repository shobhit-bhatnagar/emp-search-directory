package com.wissen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.adapter.EmployeeAdapter;
import com.wissen.model.Employee;
import com.wissen.repository.EmployeeRepository;

@RestController
@RequestMapping("/home")
public class RequestController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//@Autowired
	//Pageable pageable;
	
	
	@RequestMapping(value = "/name",method = RequestMethod.GET)
	public List<com.wissen.view.Employee> searchEmployee(@RequestParam("name") String name)
	{
		//if cache is empty load first 100 employees to trie
		// if not look up in cache.
		
		// if not found look up in db
		// if found update cache 
		List<com.wissen.view.Employee> list = new ArrayList<>();
		List<Employee> emp =  employeeRepository.findByfirstname(name);
		for(Employee e : emp)
		{
		  list.add(new EmployeeAdapter(e).getEmployee());
		}
		
		return list;
		
	}
}
