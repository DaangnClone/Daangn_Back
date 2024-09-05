package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum Parking {

    YES("주차가능"),
    NO("주차불가능");

    private final String parking;

    Parking(String parking) {
        this.parking = parking;
    }



    }
