package bank.project.bankmembership.acoount;

import bank.project.bankmembership.common.entity.BaseEntity;
import bank.project.bankmembership.customer.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Account extends BaseEntity {

    @Id
    private String number;

    private String type;

    private long balance;

    private String password;

    private int employerId;

    private int branchId;

    @ManyToOne
    private Customer customer;

}
