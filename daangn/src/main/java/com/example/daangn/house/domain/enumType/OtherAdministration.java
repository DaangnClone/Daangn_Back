package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum OtherAdministration {
    WATER("수도세"),
    ELECTRIC("전기세"),
    INTERNET("인터넷비용"),
    GAS("가스비"),
    CLEAN("청소비"),
    TV("티비"),
    PARKINGL("주차비");

    private String orders;

    OtherAdministration(String orders) {

        this.orders = orders;
    }



}
