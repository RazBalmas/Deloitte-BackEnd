package app.core.reposetory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import app.core.entity.Employee;
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Optional<List<Employee>> findByJob(String input);
	Optional<List<Employee>> findByName(String input);
	
}
