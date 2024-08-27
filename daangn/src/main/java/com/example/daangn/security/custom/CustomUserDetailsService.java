package com.example.daangn.security.custom;

import com.example.daangn.user.domain.RoleType;
import com.example.daangn.user.domain.User;
import com.example.daangn.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CustomUserDetailsService {

    private final UserRepository userRepository;

    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        User user = userRepository.findById(Long.parseLong(id))
                .orElseThrow(()-> new UsernameNotFoundException("해당유저가 없습니다."));

        CustomUserinfoDTO customUserinfoDTO = new CustomUserinfoDTO(user.getId(), user.getEmail(), user.getNickname(), user.getPassword(), user.getRole());

        return new CustomUserDetails(customUserinfoDTO);
    }

}
