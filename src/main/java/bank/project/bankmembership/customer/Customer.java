package bank.project.bankmembership.customer;

import bank.project.bankmembership.acoount.Account;
import bank.project.bankmembership.common.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer extends BaseEntity {

    @Id
    private Long id;

    private String name;

    private String email;

    private String grade;

    private Integer age;

    private String organization;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Account> accounts = new ArrayList<>();

    public void add(Account account){
        account.setCustomer(this);
        getAccounts().add(account);
    }
}
