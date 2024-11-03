package com.example.daangn.house.domain;

import com.example.daangn.global.domain.BaseTimeEntity;
import com.example.daangn.house.domain.enumType.*;

import com.example.daangn.user.domain.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

import static jakarta.persistence.EnumType.*;

@Entity
@Getter
@NoArgsConstructor
public class House extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "house_id")
    private long id;

    private String title;

    private String content;

    private double area;

    private int room;

    private int bathroom;

    private int totalFloor;

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

    @Enumerated(STRING)
    private RoleType_house role;

    @Enumerated(STRING)
    private HouseType houseType;

    @Enumerated(STRING)
    private ApprovalType approvalType;

    private int price;

    @Enumerated(STRING)
    private Direction direction;

    private int roomSize;

    private int administration;

    private int administrationPrice;

    private String administrationContent;

    @Enumerated(STRING)
    private OtherAdministration orderAdministration;

    private String totalComent;

    @Builder
    public House(String title, String content, double area, int room, int bathroom, int totalFloor, int floor, Bank bank,
                 LocalDate moveIn, Animal animal, Parking parking, Elevator elevator, String option,String Location, RoleType_house role,HouseType houseType
                 ,ApprovalType approvalType, int price, Direction direction, int roomSize, int administration, int administrationPrice, String administrationContent, OtherAdministration orderAdministration,
                 String totalComent) {
        this.title = title;
        this.content = content;
        this.area = area;
        this.room = room;
        this.bathroom = bathroom;
        this.totalFloor = totalFloor;
        this.floor = floor;
        this.bank = bank;
        this.moveIn = moveIn;
        this.animal = animal;
        this.parking = parking;
        this.elevator = elevator;
        this.option = option;
        this.Location = Location;
        this.role = role;
        this.houseType = houseType;
        this.approvalType = approvalType;
        this.price = price;
        this.direction = direction;
        this.roomSize = roomSize;
        this.administration = administration;
        this.administrationPrice = administrationPrice;
        this.administrationContent = administrationContent;
        this.orderAdministration = orderAdministration;
        this.totalComent = totalComent;

    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public void setUser(User user) {
        this.user = user;
        if(!user.getHouses().contains(this))
            user.getHouses().add(this);
    }








}
