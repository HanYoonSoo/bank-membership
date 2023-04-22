package bank.project.bankmembership.customer;

import bank.project.bankmembership.acoount.Account;
import bank.project.bankmembership.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String grade;

    private Integer age;

    private String organization;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Account> accounts = new ArrayList<>();

    public void add(Account account){
        account.setCustomer(this);
        getAccounts().add(account);
    }
}
