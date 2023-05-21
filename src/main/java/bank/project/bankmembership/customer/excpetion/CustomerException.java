package bank.project.bankmembership.customer.excpetion;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import bank.project.bankmembership.common.exception.BaseException;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
  private final Long id;
  private final String name;
}
