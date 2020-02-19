package com.springbootwithrestcontroller.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwithrestcontroller.model.Employee;
import com.springbootwithrestcontroller.service.SpringBootWithRestService;

@RestController
public class SpringBootWithRestController {

	@Autowired
	SpringBootWithRestService springBootWithRestService;

	@GetMapping("/getEmployee")
	public Employee getEmployee() {
		System.out.println("Inside getEmployee");
		Employee employee = springBootWithRestService.getEmployee();
		System.out.println(employee);
		return employee;
	}

	@PostMapping("/postEmployee")
	public String postEmployee(@RequestBody Employee newEmployee) {
		System.out.println("Inside postEmployee");
		String employeeMsg = springBootWithRestService.postEmployee(newEmployee);
		System.out.println(employeeMsg);
		return employeeMsg;
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		System.out.println("Inside postEmployee");
		String deleteMsg = springBootWithRestService.deleteEmployee(id);
		System.out.println(deleteMsg);
		return deleteMsg;
	}

	@PutMapping("/putEmployee/{id}")
	public Employee putEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		System.out.println("Inside putEmployee");
		Employee putEmployee = springBootWithRestService.putEmployee(newEmployee, id);
		return putEmployee;
	}

}
