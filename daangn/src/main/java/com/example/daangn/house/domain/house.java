package com.example.daangn.house.domain;

import com.example.daangn.global.domain.BaseTimeEntity;
import com.example.daangn.house.domain.enumType.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

import static jakarta.persistence.EnumType.*;

@Entity
@Getter
@NoArgsConstructor
public class house extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "house_id")
    private long id;

    private String title;

    private String content;

    private double area;

    private int room;

    private int bathroom;

    private int floor;

    @Enumerated(STRING)
    private Bank bank;

    private LocalDate moveIn;

    @Enumerated(STRING)
    private Animal animal;

    @Enumerated(STRING)
    private Parking parking;

    @Enumerated(STRING)
    private Elevator elevator;

    private String option;

    private String Location;

    private RoleType_house role;

    private HouseType houseType;

    private ApprovalType approvalType;

    private Direction direction;

    private int rommsize;

    private int administration;

    private OrderAdministration orderAdministration;







}
