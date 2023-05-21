package bank.project.bankmembership.customer;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import bank.project.bankmembership.common.entity.BaseEntity;

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

  private int accountId;
}
