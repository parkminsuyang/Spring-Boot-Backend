package com.example.firstproject.dto;

public class ArticleForm {
    private String title; //제목을 받을 필드
    private String content; //내용을 받을 필드

    public ArticleForm(String title, String content) {
        // 전송받은 제목과 내용을 필드에 저장
        this.title = title;
        this.content = content;
    }

    // 데이터를 잘 받았는지 확인
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

