package com.example.session4.service;

import com.example.session4.domain.User;
import com.example.session4.dto.UserRequestDto;
import com.example.session4.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor // final로 선언된 필드를 자동으로 생성자 주입
public class UserService {
    private final UserRepository userRepository;

    // 사용자 생성 비즈니스 로직
    public Long createUser(@RequestBody UserRequestDto dto) {

        // 빌더를 사용해서 User 객체 생성
        // 즉, dto에서 받은 값 기반으로 User객체 생성
        User user = User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .nickname(dto.getNickname())
                .build();
        // DB에 저장하고, 저장된 User의 ID 값을 반환
        return userRepository.save(user).getId();
    }
}

