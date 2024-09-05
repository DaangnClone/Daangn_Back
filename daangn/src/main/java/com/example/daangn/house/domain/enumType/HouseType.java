package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum HouseType {

    ONEROOM("원룸"),
    VILLA("빌라"),
    APARTMENT("아파트"),
    OFFICETEL("오피스텔"),
    shopping_mall("상가"),
    OTHER("기타");

    private final String houseType;
    HouseType(String houseType) {
        this.houseType = houseType;
    }

}
