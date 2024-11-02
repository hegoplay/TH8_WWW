package fit.iuh.se.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.iuh.se.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
