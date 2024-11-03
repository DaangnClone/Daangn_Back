package com.example.daangn.user.service;

import com.example.daangn.security.jwt.JwtUtil;
import com.example.daangn.user.domain.RoleType;
import com.example.daangn.user.domain.User;
import com.example.daangn.user.repository.UserRepository;
import com.example.daangn.user.requestDTO.LoginDTO;
import com.example.daangn.user.requestDTO.RegisterDTO;
import com.example.daangn.security.custom.CustomUserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {


    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public void register(RegisterDTO dto) {
        User user = new User(dto.getNickname(), dto.getEmail(), dto.getPassword(), dto.getLocation(), RoleType.USER);
        userRepository.save(user);
    }

    public String login(LoginDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail());
        if(user == null){
            return "user not found";
        }

        if(!user.getPassword().equals(dto.getPassword())){
            return "wrong password";
        }

        CustomUserInfoDto customUserinfoDTO = new CustomUserInfoDto(user.getId(), user.getEmail(), user.getNickname(), user.getPassword(), user.getRole());
        return jwtUtil.createAccessToken(customUserinfoDTO);

    }
}
