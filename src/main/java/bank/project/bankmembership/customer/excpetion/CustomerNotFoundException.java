package bank.project.bankmembership.customer.excpetion;

import bank.project.bankmembership.common.exception.BaseException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


public class CustomerNotFoundException extends CustomerException{
    public CustomerNotFoundException(Long id, String name) {
        super(id, name);


    }
}
