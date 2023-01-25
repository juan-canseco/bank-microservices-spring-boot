package com.jcanseco.bank.accounts.service.services;

import com.jcanseco.bank.accounts.service.dtos.AccountDto;
import com.jcanseco.bank.accounts.service.dtos.CreateAccountDto;
import com.jcanseco.bank.accounts.service.dtos.WithdrawAccountDto;
import java.util.List;
import java.util.Optional;


public interface AccountsService {
    void create(CreateAccountDto dto);
    Optional<AccountDto> getAccountById(int id);
    List<AccountDto> getAccountsByCustomer(int customerId);
    void withdraw(WithdrawAccountDto dto);
    void deposit(int accountId, double deposit);
    void close(int accountId);
}
