package com.example.demo.model.question;

import com.example.demo.model.answer.Answer;
import com.example.demo.model.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate; //작성일

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //일대다
    private List<Answer> answerList; //질문은 여러개

    @ManyToOne // 다대일
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany //다대다
    Set<SiteUser> voter; //사용자가 여러명일 수 있으니깐, set 중복x
}
