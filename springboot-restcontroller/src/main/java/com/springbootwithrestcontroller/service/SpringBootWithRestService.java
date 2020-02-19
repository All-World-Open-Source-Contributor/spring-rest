package com.springbootwithrestcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootwithrestcontroller.dao.SpringBootWithRestDao;
import com.springbootwithrestcontroller.model.Employee;

@Service
public class SpringBootWithRestService {

	@Autowired
	SpringBootWithRestDao springBootWithRestDao;
	
	public Employee getEmployee(){
		System.out.println("Inside getProducts of SpringBootWithRestService");
		
		Employee employee = springBootWithRestDao.getEmployee();
		return employee;
	}

	public String postEmployee(Employee newEmployee){
		System.out.println("Inside postExample of SpringBootWithRestService");
		String employeeMsg = springBootWithRestDao.postEmployee(newEmployee);
		return employeeMsg;
	}
	
	public String deleteEmployee(Long id) {
		System.out.println("Inside deleteEmployee of SpringBootWithRestService");
		String employeeMsg = springBootWithRestDao.deleteEmployee(id);
		return employeeMsg;
	}

	public Employee putEmployee(Employee newEmployee, Long id) {
		System.out.println("Inside deleteEmployee of SpringBootWithRestService");
		Employee putEmployee = springBootWithRestDao.putEmployee(newEmployee, id);
		return putEmployee;
	}
	
	
}
