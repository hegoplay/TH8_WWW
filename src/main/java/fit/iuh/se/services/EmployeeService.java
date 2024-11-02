package fit.iuh.se.services;

import java.util.List;

import fit.iuh.se.entities.Employee;


public interface EmployeeService {
	public void update(Employee e);
	public List<Employee> getAll();
	public Employee getById(int id);
	public void deleteById(int id);
	public void save(Employee e);
}
