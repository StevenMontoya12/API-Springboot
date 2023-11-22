package dev.stevenmontoya.springboot.services;

import dev.stevenmontoya.springboot.entities.Customer;
import dev.stevenmontoya.springboot.entities.Employee;

import java.util.List;


public interface IEmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    void remove(Long id);
    void save(Employee employee);
}
