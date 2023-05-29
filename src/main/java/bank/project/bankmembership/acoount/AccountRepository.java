package bank.project.bankmembership.acoount;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface AccountRepository extends JpaRepository<Account, String> {
  List<Account> findAccountByCustomerId(long customerId);

  @Transactional
  Account findAccountByNumber(String accountNumber);
}
