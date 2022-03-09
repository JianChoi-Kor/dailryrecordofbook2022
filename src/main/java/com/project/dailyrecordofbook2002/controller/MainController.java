package com.project.dailyrecordofbook2002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    // 메인
    @GetMapping("")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/home");

        return modelAndView;
    }

    // 책방 소개
    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/about_store");

        return modelAndView;
    }

    // 서점 소개
    @GetMapping("/about/store")
    public ModelAndView aboutStore() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/about_store");

        return modelAndView;
    }

    // 모임 소개
    @GetMapping("/about/community")
    public ModelAndView aboutCommunity() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/about_community");

        return modelAndView;
    }

    // 지기 소개
    @GetMapping("/about/member")
    public ModelAndView aboutMember() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/about_member");

        return modelAndView;
    }

    // SNS
    @GetMapping("/sns")
    public ModelAndView sns() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/sns");

        return modelAndView;
    }

    // 오시는 길
    @GetMapping("/come")
    public ModelAndView toCome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/to_come");

        return modelAndView;
    }
}
