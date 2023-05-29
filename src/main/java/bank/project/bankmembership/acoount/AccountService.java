package bank.project.bankmembership.acoount;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import bank.project.bankmembership.acoount.dto.DetailAccount;
import bank.project.bankmembership.transaction.Transaction;
import bank.project.bankmembership.transaction.TransactionRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import bank.project.bankmembership.acoount.dto.AccountGetResponse;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;
  private final TransactionRepository transactionRepository;
  public List<AccountGetResponse> getAccounts(long customerId) {
    return accountRepository.findAccountByCustomerId(customerId)
            .stream().map(account -> AccountGetResponse.builder()
                    .number(account.getNumber())
                            .balance(account.getBalance())
                            .branchId(account.getBranchId())
                            .customerId(account.getCustomerId())
                            .build())
                            .toList();
  }

  public DetailAccount getAccountDetail(String accountNumber, LocalDateTime viewYearMonth){
    Account account = Optional.ofNullable(accountRepository.findAccountByNumber(accountNumber)).orElseThrow();

    LocalDateTime startDate = viewYearMonth.plusDays(1);
    LocalDateTime endDate = viewYearMonth.plusMonths(1).minusDays(1);
    List<Transaction> transactionList = transactionRepository.findByAccountNumberAndCreatedAtBetween(accountNumber, startDate, endDate);

    return DetailAccount.builder()
            .accountNumber(account.getNumber())
            .accountAmount(account.getBalance())
            .accountType(account.getType())
            .depositAndWithdrawalHistory(transactionList)
            .build();
  }
}
