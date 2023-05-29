package bank.project.bankmembership.acoount.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Builder
@ToString
@Getter
public class AccountGetResponse {
  private String number;
  private Long balance;
  private int branchId;
  private Long customerId;
}
