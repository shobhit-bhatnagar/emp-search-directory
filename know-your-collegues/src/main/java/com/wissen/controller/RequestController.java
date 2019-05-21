package com.wissen.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.model.Employee;
import com.wissen.repository.EmployeeRepository;

@RestController
@RequestMapping("/home")
public class RequestController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	Pageable pageable;
	
	
	@RequestMapping(value = "/name",method = RequestMethod.GET)
	public List<Employee> searchEmployee(@RequestParam("name") String name)
	{
		//if cache is empty load first 100 employees to trie
		// if not look up in cache.
		
		// if not found look up in db
		// if found update cache 
		Page<Employee> page = employeeRepository.findAll(pageable);
		return page.filter(e->e.getFirstname().equals(name)).stream().collect(Collectors.toList());
		
		
		
	}
}
