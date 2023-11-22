package dev.stevenmontoya.springboot.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Firstname;
    private String Lastname;
    private String Email;
    private String Phone;
    private String Address;
    private Double Salary;
}
