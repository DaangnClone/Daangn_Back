package com.example.daangn.house.domain.enumType;

import lombok.Getter;

@Getter
public enum RoleType_house {

    TENANT("세입자"),
    HOMEOWNER("집주인");

    private String roleName;

    RoleType_house(String roleName) {
        this.roleName = roleName;
    }


}
