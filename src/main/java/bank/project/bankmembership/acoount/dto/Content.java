package bank.project.bankmembership.acoount.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Content {
    private String accountNumber;
    private Long accountAmount;
}
