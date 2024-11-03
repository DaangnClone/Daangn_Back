package com.example.daangn.init;

import com.example.daangn.user.domain.RoleType;
import com.example.daangn.user.domain.User;
import com.example.daangn.user.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        User user = new User("user1", "test@naver.com", passwordEncoder.encode("1234"), "천안시 동남구 안서동", RoleType.USER);

        userRepository.save(user);
    }

}
