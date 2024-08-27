package com.example.daangn.user.controller;

import com.example.daangn.user.domain.User;
import com.example.daangn.user.requestDTO.LoginDTO;
import com.example.daangn.user.requestDTO.RegisterDTO;
import com.example.daangn.user.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterDTO registerDTO) {
        userService.register(registerDTO);

        String token = userService.login(new LoginDTO(registerDTO.getEmail(), registerDTO.getPassword()));
        insertToken(token);

        return token;

    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        String loginStatus = userService.login(loginDTO);

        if(loginStatus.equals("user not found") || loginStatus.equals("password error")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(loginStatus);
        }

        insertToken(loginStatus);

        return ResponseEntity.status(HttpStatus.OK).body(loginStatus);

    }

    public void insertToken(String token) {
        Cookie cookie = new Cookie("accessToken", token);

        cookie.setPath("/");
        cookie.setSecure(false);
        cookie.setMaxAge(60 * 60 * 24 * 30); // 30 일
        cookie.setHttpOnly(true);

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.addCookie(cookie);
    }


}
