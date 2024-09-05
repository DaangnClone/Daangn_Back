package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum Direction {

    SOUTH("남향"),
    EAST("동향"),
    WEST("서향"),
    NORTH("북향"),
    SOUTHEAST("남동향"),
    SOUTHWEST("남서양"),
    NORTHWEST("북서향"),
    NORTHEASTERN("북동향");

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

}
