package com.jcanseco.bank.accounts.service.repositories;

import com.jcanseco.bank.accounts.service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
