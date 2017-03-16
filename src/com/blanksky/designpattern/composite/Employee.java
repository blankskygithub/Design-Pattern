package com.blanksky.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String debt;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name,String debt,int salary) {
		this.name=name;
		this.debt=debt;
		this.salary=salary;
		this.subordinates=new ArrayList<Employee>();
	}
	
	public void add(Employee employee){
		subordinates.add(employee);
	}
	public void remove(Employee employee){
		subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	public String toString(){
		String employeeInfo = "Employee:[Name:"+name+", Debt:"+debt+", Salary:"+salary+"]";
		return employeeInfo;
	}
}
