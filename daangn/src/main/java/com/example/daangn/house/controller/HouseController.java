package com.example.daangn.house.controller;

import com.example.daangn.house.requestDto.HouseCreatePostDTO;
import com.example.daangn.house.service.HouseService;
import com.example.daangn.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
@RequiredArgsConstructor
public class HouseController {

    private final HouseService houseService;

    @PostMapping("creat")
    public String createHousePost(@RequestPart(value = "dto") HouseCreatePostDTO requestDto,
                                  @AuthenticationPrincipal User user){

        houseService.creat(user.getId(), requestDto);

        return "success";
    }



}
