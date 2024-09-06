package com.example.daangn.house.requestDto;

import com.example.daangn.house.domain.enumType.*;
import lombok.Builder;
import org.joda.time.LocalDate;

@Builder
public class HouseCreatePostDTO {

    private RoleType_house role;

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

    private int AdministrationPrice;

    private OtherAdministration orderAdministration;

    private String AdministrationContent;

    private Bank bank;

    private Animal animal;

    private Parking parking;

    private LocalDate moveIn;

    private String option;

    private String totalComent;



}
