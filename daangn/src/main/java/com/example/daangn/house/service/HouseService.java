package com.example.daangn.house.service;

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

        Optional<User> user = userRepository.findById(id);



    }
}
