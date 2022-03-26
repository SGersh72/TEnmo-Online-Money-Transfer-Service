package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private Long userId;
    private BigDecimal balance;

    public Account() {} //default bc Spring freaks out

    public Long getId() {
        return id;
    }
    public Long getUserId() {
        return userId;
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
