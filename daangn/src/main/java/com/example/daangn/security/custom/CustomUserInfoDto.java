package com.example.daangn.security.custom;

import com.example.daangn.user.domain.RoleType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomUserInfoDto {
    private Long userId;

    private String email;

    private String nickname;

    private String password;

    private RoleType role;
}
