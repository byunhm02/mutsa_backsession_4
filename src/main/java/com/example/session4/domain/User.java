package com.example.session4.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor // 기본 생성자 (JPA가 객체 만들 때 사용)
@AllArgsConstructor //모든 필드를 받는 생성자 (Builder가 내부적으로 사용)
@Builder //객체를 편리하게 만들 수 있도록 빌더 메서드 생성
public class User {
    @Id // 기본 키 (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 값 (MySQL의 AUTO_INCREMENT)
    private Long id;

    private String nickname;
    private String email;
    private String password;
}

