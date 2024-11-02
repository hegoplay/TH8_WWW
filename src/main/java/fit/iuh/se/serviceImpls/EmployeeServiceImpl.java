package fit.iuh.se.serviceImpls;

import java.util.List;

import org.springframework.stereotype.Service;

import fit.iuh.se.entities.Employee;
import fit.iuh.se.repos.EmployeeRepository;
import fit.iuh.se.services.EmployeeService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class EmployeeServiceImpl implements EmployeeService{

	EmployeeRepository repo;
	
	@Override
	@Transactional
	public void update(Employee e) {
		// TODO Auto-generated method stub
//		if (repo.findById(e.getId())!=null)
		repo.save(e);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		repo.save(e);
	}

}
