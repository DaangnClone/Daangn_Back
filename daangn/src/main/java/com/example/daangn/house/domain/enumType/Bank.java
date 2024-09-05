package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum Bank {
    YES("대출_가능"),
    NO("대출_불가능");

    private final String bank;

    Bank(String bank) {
        this.bank = bank;

    }
}
