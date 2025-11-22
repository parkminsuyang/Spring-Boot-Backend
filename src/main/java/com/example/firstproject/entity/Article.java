package com.example.firstproject.entity;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    //Article 생성자 추가
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    //toString()메서드 추가


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
