package com.example.daangn.house.service;

import com.amazonaws.services.kms.model.NotFoundException;
import com.example.daangn.house.domain.House;
import com.example.daangn.house.repository.HouseRepository;
import com.example.daangn.house.requestDto.HouseCreatePostDTO;
import com.example.daangn.user.domain.User;
import com.example.daangn.user.repository.UserRepository;
import com.example.daangn.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HouseService {

    private final HouseRepository houseRepository;
    private final UserRepository userRepository;

    public void creat(long id, HouseCreatePostDTO requestDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Could not found user with id: " + id));

        House house = House.builder()
                .title(requestDto.getTitle())
                .content(requestDto.getContent())
                .area(requestDto.getArea())
                .room(requestDto.getRoom())
                .bathroom(requestDto.getBathroom())
                .totalFloor(requestDto.getTotalFloor())
                .floor(requestDto.getFloor())
                .bank(requestDto.getBank())
                .moveIn(requestDto.getMoveIn())
                .animal(requestDto.getAnimal())
                .parking(requestDto.getParking())
                .elevator(requestDto.getElevator())
                .option(requestDto.getOption())
                .Location(requestDto.getLocation())
                .role(requestDto.getRole())
                .houseType(requestDto.getHouse())
                .approvalType(requestDto.getApprovalType())
                .price(requestDto.getPrice())
                .direction(requestDto.getDirection())
                .roomSize(requestDto.getRoomSize())
                .administration(requestDto.getAdministration())
                .administrationPrice(requestDto.getAdministrationPrice())
                .administrationContent(requestDto.getAdministrationContent())
                .orderAdministration(requestDto.getOrderAdministration())
                .totalComent(requestDto.getTotalComent())
                .build();

        house.setUser(user);
        houseRepository.save(house);


    }
}
