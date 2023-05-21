package bank.project.bankmembership.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import bank.project.bankmembership.common.entity.BaseEntity;

@Entity
public class Transaction extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long balance;

  private String type;

  private Long balance_after_transaction;

  private String accountNumber;
}
