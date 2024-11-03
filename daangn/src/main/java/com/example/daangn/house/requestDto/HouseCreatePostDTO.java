package com.example.daangn.house.requestDto;

import com.example.daangn.house.domain.enumType.*;
import lombok.Builder;
import lombok.Getter;
import org.joda.time.LocalDate;

@Builder
@Getter
public class HouseCreatePostDTO {

    private RoleType_house role;

    private String title;

    private double area;

    private Elevator elevator;

    private HouseType house;

    private String location;

    private String content;

    private ApprovalType approvalType;

    private int price;

    private Direction direction;

    private int roomSize;

    private int room;

    private int bathroom;

    private int totalFloor;

    private int floor;

    private int administrationPrice;

    private int administration;

    private OtherAdministration orderAdministration;

    private String administrationContent;

    private Bank bank;

    private Animal animal;

    private Parking parking;

    private LocalDate moveIn;

    private String option;

    private String totalComent;



}
