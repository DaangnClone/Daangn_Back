package com.example.daangn.security.custom;

import com.example.daangn.user.domain.RoleType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CustomUserinfoDTO {

    private Long userId;

    private String email;

    private String nickname;

    private String password;

    private RoleType role;

}
