package dev.stevenmontoya.springboot.repository;

import dev.stevenmontoya.springboot.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier,Long> {




}
