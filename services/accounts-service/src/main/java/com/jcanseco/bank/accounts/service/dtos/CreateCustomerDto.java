package com.jcanseco.bank.accounts.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerDto {
    private String fullName;
    private String cellPhone;
    private String email;
}
