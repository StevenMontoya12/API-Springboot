package dev.stevenmontoya.springboot.repository;


import dev.stevenmontoya.springboot.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
