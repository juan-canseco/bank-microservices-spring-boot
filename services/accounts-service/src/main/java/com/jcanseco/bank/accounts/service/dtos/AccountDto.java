package com.jcanseco.bank.accounts.service.dtos;
import java.time.LocalDate;

public class AccountDto {
    private long id;
    private String accountType;
    private String accountStatus;
    private double balance;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
