package com.jcanseco.bank.common.events;

import java.time.LocalDate;

public class AccountDepositEvent {
    private long accountId;
    private LocalDate createdAt;
}
