package com.wissen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wissen.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	public List<Employee> findByfirstname(String firstname);
}
