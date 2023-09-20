package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	static Employee emp[];
	static {
		emp=new Employee[] {
				new Employee(101,"amit",20000.0f),
				new Employee(102,"sumit",30000.0f)
		};
	}
	List<Employee> empList1=Arrays.asList(emp);
	List<Employee> empList=new ArrayList<>(empList1);
	
	@RequestMapping("/getall")
	public List<Employee> getAllEmployee()
	{
		return empList;
	}
	
	@RequestMapping(value="/search/{id}",method=RequestMethod.GET)
	public Employee searchById(@PathVariable("id") int id1)
	{
		for(Employee employee:empList)
		{
			if(employee.getEmployeeId()==id1)
			{
				return employee;
			}
		}
		return null;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee emp)
	{
		empList.add(emp);
		return emp;
	}
	
	@RequestMapping(value="/remove/{id}",method=RequestMethod.DELETE)
	@DeleteMapping("/remove/{id}")
	public Employee removeEmployee(@PathVariable("id") int id1)
	{
		
		for(Employee employee : empList)
		{
			if(employee.getEmployeeId()==id1)
			{
				empList.remove(employee);
				return employee;
			}
		}
		return null;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		for(Employee employee : empList)
		{
			if(employee.getEmployeeId()==emp.getEmployeeId())
			{
				empList.remove(employee);
				empList.add(emp);
				return employee;
			}
		}
		return null;
	}
}


