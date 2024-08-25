package com.example.daangn.User.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private long id;

    private String nickname;

    private String password;

    private String location;

    private LocalDate create_at;

    private LocalDate update_at;

    public User(String nickname, String password, String location, LocalDate create_at, LocalDate update_at) {
        this.nickname = nickname;
        this.password = password;
        this.location = location;
        this.create_at = create_at;
        this.update_at = update_at;
    }



}
