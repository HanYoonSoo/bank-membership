package bank.project.bankmembership.acoount;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bank.project.bankmembership.acoount.dto.AccountGetResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
  private final AccountService accountService;

  @GetMapping("/accounts") // TODO: header -> customer_id
  public AccountGetResponse getAccounts(@RequestParam Long id) { // /api/v1/accounts?id=00
    return accountService.getAccounts(id);
  }
}
