package bank.project.bankmembership.acoount;

import java.util.List;

import bank.project.bankmembership.acoount.dto.Content;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import bank.project.bankmembership.acoount.dto.AccountGetResponse;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;

  public AccountGetResponse getAccounts(long customerId) {
    List<Content> contents = accountRepository.findAccountByCustomerId(customerId).stream()
        .map(
            account ->
                Content.builder()
                    .accountNumber(account.getNumber())
                    .accountAmount(account.getBalance())
                    .build())
        .toList();

    return AccountGetResponse.builder()
            .content(contents)
            .resultCode(200)
            .resultMsg("성공했습니다")
            .build();
  }
}
