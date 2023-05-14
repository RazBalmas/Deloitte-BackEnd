package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.DataGeneration.DataGenerator;
import app.core.reposetory.EmployeeRepo;
import app.core.service.EmployeeService;
@Component
public class TestDataUpload implements CommandLineRunner {
	
	@Autowired
	private DataGenerator dataGenerator;
	@Autowired
	private EmployeeService employeeService; 
	
	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 100; i++) {
			int random = (int)(Math.random()*2);
			switch (random) {
			case 0 :
				employeeService.addEmployee(dataGenerator.genarteRandomFemaleEmployee());
			case 1 :
				employeeService.addEmployee(dataGenerator.genarteRandomMaleEmployee());
			}
		
		}

	}

}
