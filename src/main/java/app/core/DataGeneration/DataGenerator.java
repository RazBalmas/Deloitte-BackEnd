package app.core.DataGeneration;

import java.beans.JavaBean;

import org.springframework.stereotype.Component;

import app.core.entity.Employee;

@Component
public class DataGenerator {

	public DataGenerator() {
		// TODO Auto-generated constructor stub
	}

	public enum LastNames {
		Cohen, Levi, Merdock, Swaly, Wretch, Shlomo, Stewart, Kennedy, Lazzar, Po, Shwartz, Lenon, Tamiri, Halaby;
	}

	public enum firstMaleNames {
		Dani, Raz, Din, Ahron, Bob, Queency, Mark, Jhon, Amnon, Kieth, Robert, Tom, Harvey;
	}
	public enum firstFemaleNames {
		Ruthi, Tamara, Dana, Sally, Barbra, Yahel, Shoshana, Batya, Koral, Kelly, Riky, Rachel, Hanna;
	}

	public enum jobs {
		General_Manager, Programmer, Cleaning_Crew, Driver, Sequrity, Human_Resources, Financial_Assistant, Secritary, DevOps, Kitchen_Crew;
	}
	
	

	public jobs getJob() {
		jobs [] random = jobs.values();
		return random[(int)(Math.random()*random.length)];
	}

	public firstMaleNames getFirstMaleName() {
		firstMaleNames [] random = firstMaleNames.values();
		return random[(int)(Math.random()*random.length)];
	}
	
	public firstFemaleNames getFirstFemaleName() {
		firstFemaleNames [] random = firstFemaleNames.values();
		return random[(int)(Math.random()*random.length)];
	}

	public LastNames getLastName() {
		LastNames [] random = LastNames.values();
		return random[(int)(Math.random()*random.length)];
	}


	public Employee genarteRandomMaleEmployee() {
		Employee employee = new Employee();
		String firstName = getFirstMaleName().toString();
		String lastName = getLastName().toString();
		String job = getJob().toString();
		if(job.contains("_")) {
			job = job.replace("_", " ");
		}
		employee.setId(0);
		employee.setJob(job);
		employee.setName(firstName + " " + lastName);
		employee.setImgName("male-" + ((int)((Math.random()*6))+1));
		return employee;
		
	}
	public Employee genarteRandomFemaleEmployee() {
		Employee employee = new Employee();
		String firstName = getFirstFemaleName().toString();
		String lastName = getLastName().toString();
		String job = getJob().toString();
		if(job.contains("_")) {
			job = job.replace("_", " ");
		}
		employee.setId(0);
		employee.setJob(job);
		employee.setName(firstName + " " + lastName);
		employee.setImgName("female-" + ((int)((Math.random()*8))+1));
		return employee;
		
	}
}
