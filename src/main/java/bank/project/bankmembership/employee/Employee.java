package bank.project.bankmembership.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private Long id;

    private String name;

    private Long branch_id;
}
