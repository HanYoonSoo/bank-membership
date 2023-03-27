package bank.project.bankmembership.branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {

    @Id
    private Long id;

    private String name;

    private String address;
}
