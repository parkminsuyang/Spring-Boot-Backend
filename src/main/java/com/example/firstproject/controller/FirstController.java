package com.example.firstproject.controller;
import org.springframework.ui.Model; //Model 클래스 패키지 자동 임포트
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "홍팍");
        return "greetings"; //greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "홍길동");
        return "goodbye"; //greetings.mustache 파일 반환
    }
}