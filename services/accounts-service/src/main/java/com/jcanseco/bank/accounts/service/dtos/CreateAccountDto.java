package com.jcanseco.bank.accounts.service.dtos;

import lombok.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateAccountDto {
    @Min(value = 1, message = "CustomerId cannot be negative")
    private long customerId;
    @NotEmpty
    private String accountType;
    @Min(value = 0, message = "The initial balance cannot be negative")
    private double initialBalance;
}
