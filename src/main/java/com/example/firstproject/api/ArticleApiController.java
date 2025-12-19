package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleApiController {
    @Autowired
    private ArticleRepository articleRepository; //게시글 리파지터리 주입
    //GET
    @GetMapping("api/articles") //URL 요청 접수
    public List<Article> index() { //index() 메서드 정의
        return articleRepository.findAll();
    }
    @GetMapping("api/articles/{id}") //단일 아티클 반환
    public Article show(@PathVariable Long id) {  //반환형 Article
        return articleRepository.findById(id).orElse(null); //해당 엔티티 빈환 or ㅜㅕㅣㅣ
    }
    //POST
    @PostMapping("/api/articles") //URL 요청 접수
    public Article create(@RequestBody ArticleForm dto) { //create() 메서드 정의
        Article article=dto.toEntity(); //dto 엔티티 변환
        return articleRepository.save(article); //DB에 저장 후 반환
    }
    //PATCH
    //DELETE
}
