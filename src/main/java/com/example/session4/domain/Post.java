package com.example.session4.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private int viewCount = 0;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    /*
    LAZY로딩: 지연 로딩(Lazy Loading)
        -> 필요할 때까지 연관 엔티티를 DB에서 가져오지 않고 기다리는 방식
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}