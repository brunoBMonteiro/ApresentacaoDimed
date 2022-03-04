package net.guides.springboot2.springboot2jpacrudexample.model;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
public class Employee extends RepresentationModel<Employee> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email_address", nullable = false)
    private String emailId;
}
