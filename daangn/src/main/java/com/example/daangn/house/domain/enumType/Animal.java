package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum Animal {
    YES("반려견가능"),
    NO("반려견불가능");

    private final String animal;

    Animal(String animal) {
        this.animal = animal;
    }


}
