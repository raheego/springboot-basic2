package com.encore.springjwt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Role {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //자동증가
    private Integer id;

    @Enumerated(EnumType.STRING) //유효성 검사
    @Column(length = 20)
    private ERole name;

}

