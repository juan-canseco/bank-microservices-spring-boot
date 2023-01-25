package com.jcanseco.bank.accounts.service.controllers;

import com.jcanseco.bank.accounts.service.dtos.WithdrawAccountDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@Slf4j
@RestController
public class AccountsController {

    public ResponseEntity<?> createAccount() {
        log.info("Demo");
        return ResponseEntity.ok().build();
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> withdrawAccount(@Valid @RequestBody WithdrawAccountDto dto) {
        log.info("Account withdraw begins");
        log.info("Account withdraw ends");
        return ResponseEntity.of(Optional.empty());
    }

}
