package com.example.session4.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

//유저 생성시 전달하는 요청 데이터(dto)
@Getter
@NoArgsConstructor
public class UserRequestDto {

    private String email;
    private String password;
    private String nickname;
}
