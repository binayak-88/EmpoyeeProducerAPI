/**
 * 
 */
package org.learntek.eurekeclient.controller;

import java.util.ArrayList;
import java.util.List;

import org.learntek.eurekeclient.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class EmpployeeAPiController {
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getEmpoyees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee1 = new Employee();
		employee1.setEid(101);
		employee1.setEname("Binayak");
		employee1.setEsal(12345.00);
		
		Employee employee2 = new Employee();
		employee2.setEid(102);
		employee2.setEname("Rupali");
		employee2.setEsal(112345.00);
		
		employees.add(employee1);
		employees.add(employee2);
		
		ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
		return responseEntity;
		
	}
}
