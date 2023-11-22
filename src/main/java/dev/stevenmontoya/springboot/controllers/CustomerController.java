package dev.stevenmontoya.springboot.controllers;
import dev.stevenmontoya.springboot.entities.Customer;
import dev.stevenmontoya.springboot.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private ICustomerService service;

    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/customers/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/customers/{id}")
    public void remove(@PathVariable Long id){
        service.remove(id);
    }


    @PostMapping("/api/customers")
    public void save(@RequestBody Customer customer){
        service.save(customer);
    }



}
