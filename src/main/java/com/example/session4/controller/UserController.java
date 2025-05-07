package com.example.session4.controller;

import com.example.session4.dto.UserRequestDto;
import com.example.session4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v0/users")
public class UserController {

    private final UserService userService;

    // 사용자 생성 API: POST /api/v0/users
    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody UserRequestDto userRequestDto) { //dto사용
        // 상태코드 201(Created)와 함께 생성된 유저 ID 반환
        return ResponseEntity.status(201).body(userService.createUser(userRequestDto));
    }
}
