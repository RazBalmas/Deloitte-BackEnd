package app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entity.Employee;
import app.core.service.EmployeeService;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		try {
		return employeeService.getAllEmployee();
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
		}
	@GetMapping("/getEmployeesByString")
	public List<Employee> getEmployeesByString(String input) {
		try {
			 return employeeService.getEmployeeByString(input);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	@GetMapping("/passiveSearch")
	public List<Employee> passiveSearch(String input) {
		try {
			return employeeService.passiveSearch(input);
		}
		catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}
	
}
