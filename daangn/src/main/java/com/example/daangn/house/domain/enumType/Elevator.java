package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum Elevator {

    YES("엘레베이터_있음"),
    NO("앨레베이터_없음");

    private final String elevator;

    Elevator(String elevator) {
        this.elevator = elevator;
    }


}
