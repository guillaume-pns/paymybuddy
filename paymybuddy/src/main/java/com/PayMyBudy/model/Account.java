package com.PayMyBudy.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Account {

    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNT_SEQ")
    @SequenceGenerator(name = "ACCOUNT_SEQ", sequenceName = "ACCOUNT_SEQ")


    private Integer accountId;

    private Double amount;
    private String iban;

    public Account plus(double amount) {

        this.amount += amount;
        return this;
    }

    public Account minus(double amount) {

        this.amount -= amount;
        return this;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
