package com.example.daangn.user.domain;

import com.example.daangn.global.domain.BaseTimeEntity;
import com.example.daangn.house.domain.House;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@NoArgsConstructor
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_id")
    private long id;

    private String nickname;

    private String email;

    private String password;

    private String location;

    @Enumerated(STRING)
    private RoleType role;

    public User(String nickname, String email ,String password, String location, RoleType role) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.location = location;
        this.role = role;
    }

    @OneToMany(mappedBy = "user")
    private List<House> houses = new ArrayList<>();


}
