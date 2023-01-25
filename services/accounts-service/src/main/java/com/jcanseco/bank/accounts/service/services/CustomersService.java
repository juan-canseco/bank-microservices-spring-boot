package com.jcanseco.bank.accounts.service.services;

import com.jcanseco.bank.accounts.service.dtos.CreateCustomerDto;
import com.jcanseco.bank.accounts.service.dtos.CustomerDto;

import java.util.Optional;

public interface CustomersService {
    void create(CreateCustomerDto dto);
    void disable(String customerId);
    Optional<CustomerDto> getById(long customerId);
}
