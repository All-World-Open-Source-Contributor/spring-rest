package com.springbootwithrestcontroller.dao;

import org.springframework.stereotype.Component;

import com.springbootwithrestcontroller.model.Employee;

@Component
public class SpringBootWithRestDao {

	public Employee getEmployee(){
		System.out.println("Inside getEmployee of SpringBootWithRestDao");
		Employee employee = new Employee(); 
		employee.setEmpId("01");
		employee.setFirstName("Subrat");
		employee.setLastName("Das");
		employee.setRole("Associate Tech Specialist");
		return employee;
	}

	public String postEmployee(Employee newEmployee){
		System.out.println("Inside postEmployee of SpringBootWithRestDao for " + newEmployee);
		
		return "Added "+ newEmployee.getFirstName() +" successfully";
	}
	
	public Employee putEmployee(Employee newEmployee, Long id) {
		System.out.println("Inside postEmployee of SpringBootWithRestDao");
		Employee employee = getEmployee();
		if(employee.getEmpId().equalsIgnoreCase(newEmployee.getEmpId())) {
			employee.setFirstName(newEmployee.getFirstName());
			employee.setLastName(newEmployee.getLastName());
			employee.setRole(newEmployee.getRole());
		}else {
			postEmployee(newEmployee);
			employee = newEmployee;
		}
		return employee;
	}

	public String deleteEmployee(Long id) {
		System.out.println("Inside deleteEmployee of SpringBootWithRestDao for id = " + id);
		return "Employee with employee id "+ id +" is deleted successfully";
	}

}
