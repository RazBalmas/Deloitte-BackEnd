package app.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entity.Employee;
import app.core.reposetory.EmployeeRepo;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired 
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}
	
	public List<Employee> passiveSearch(String input) {
		System.out.println("======================");
		System.out.println(input);
		List<Employee> allEmployee = employeeRepo.findAll();
		List<Employee> employeesBySearch = new ArrayList<>();
		for(Employee employee : allEmployee) {
			if(employee.getJob().toLowerCase().contains(input.toLowerCase()) ||
					employee.getName().toLowerCase().contains(input.toLowerCase())) {
					
				employeesBySearch.add(employee);
			}
		}
		return employeesBySearch;
	}
	public List<Employee> getEmployeeByString(String input) {
	List<Employee> allEmployee = employeeRepo.findAll();
	List<Employee> employeesBySearch = new ArrayList<>();
		
	for(Employee employee : allEmployee) {
		if(employee.getJob().toLowerCase().contains(input.toLowerCase()) ||
				employee.getName().toLowerCase().contains(input.toLowerCase())) {
			employeesBySearch.add(employee);
		}
	}
		return employeesBySearch;
	}
	
	
	public Employee addEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}
}
