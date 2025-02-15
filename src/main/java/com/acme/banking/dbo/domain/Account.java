package com.acme.banking.dbo.domain;

import java.util.UUID;

public interface Account {
    UUID getId();
    UUID getClientId(); //TODO reference integrity
    double getAmount();
    void setAmount(double amount);
    Client getClient();
}
