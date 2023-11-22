package dev.stevenmontoya.springboot.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "suppliers")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String Email;
    private String Phone;
    private String Address;
    private String Web;
    private String Contact;

}
