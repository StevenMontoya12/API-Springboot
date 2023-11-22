package dev.stevenmontoya.springboot.repository;

import dev.stevenmontoya.springboot.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {




}
