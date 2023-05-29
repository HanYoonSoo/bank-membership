package bank.project.bankmembership.acoount;

import java.time.LocalDateTime;
import java.util.List;

import bank.project.bankmembership.acoount.dto.DetailAccount;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import bank.project.bankmembership.acoount.dto.AccountGetResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
  private final AccountService accountService;

  @GetMapping("/accounts") // TODO: header -> customer_id
  public ResponseEntity<List<AccountGetResponse>> getAccounts(@RequestParam Long customerId) { // /api/v1/accounts?id=00
    return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccounts(customerId));
  }

  @GetMapping("/account/{accountNumber}/detail")
  public ResponseEntity<DetailAccount> getAccountDetail(@PathVariable String accountNumber, @RequestParam long customerId, @RequestParam LocalDateTime viewYearMonth){
    // TODO: customerId 검증
    return ResponseEntity.ok(accountService.getAccountDetail(accountNumber, viewYearMonth));
  }
}
