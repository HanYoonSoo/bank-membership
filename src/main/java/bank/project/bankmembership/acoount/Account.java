package bank.project.bankmembership.acoount;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import bank.project.bankmembership.common.entity.BaseEntity;

@Entity
@Getter
@Setter
public class Account extends BaseEntity {

  @Id private String number;

  private String type;

  private long balance;

  private String password;

  private int employerId;

  private int branchId;

  private long customerId;
}
