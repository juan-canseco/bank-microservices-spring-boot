package com.jcanseco.bank.accounts.service.repositories;

import com.jcanseco.bank.accounts.service.entities.Account;
import com.jcanseco.bank.accounts.service.entities.AccountStatus;
import com.jcanseco.bank.accounts.service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> getAccountsByCustomerAndStatus(Customer customer, AccountStatus status);
}
