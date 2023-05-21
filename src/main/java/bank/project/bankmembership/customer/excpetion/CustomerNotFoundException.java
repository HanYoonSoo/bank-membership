package bank.project.bankmembership.customer.excpetion;

public class CustomerNotFoundException extends CustomerException {
  public CustomerNotFoundException(Long id, String name) {
    super(id, name);
  }
}
