package bank.project.bankmembership.customer.excpetion;

import bank.project.bankmembership.common.exception.BaseException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
    private final Long id;
    private final String name;
}
