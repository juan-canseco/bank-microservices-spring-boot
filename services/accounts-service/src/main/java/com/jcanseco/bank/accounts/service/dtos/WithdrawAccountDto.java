package com.jcanseco.bank.accounts.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class WithdrawAccountDto {
    @Min(value = 1, message = "AccountId cannot be negative or zero")
    private long accountId;
    @Min(value = 1, message = "Amount must be greater or equal than one")
    private double amount;
}
