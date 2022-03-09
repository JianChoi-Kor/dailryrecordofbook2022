package com.project.dailyrecordofbook2002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/faq")
public class FaqController {

    // 자주 묻는 질문
    @GetMapping("")
    public ModelAndView faq() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/faq_category1");

        return modelAndView;
    }

    // Category1
    @GetMapping("/category1")
    public ModelAndView faq_category1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/faq_category1");

        return modelAndView;
    }

    // Q1.
    @GetMapping("/category1/q1")
    public ModelAndView faq_c1_q1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category1/q1");

        return modelAndView;
    }

    // Q2.
    @GetMapping("/category1/q2")
    public ModelAndView faq_c1_q2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category1/q2");

        return modelAndView;
    }

    // Q3.
    @GetMapping("/category1/q3")
    public ModelAndView faq_c1_q3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category1/q3");

        return modelAndView;
    }

    // Q4.
    @GetMapping("/category1/q4")
    public ModelAndView faq_c1_q4() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category1/q4");

        return modelAndView;
    }

    // Q5.
    @GetMapping("/category1/q5")
    public ModelAndView faq_c1_q5() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category1/q5");

        return modelAndView;
    }

    // Category2
    @GetMapping("/category2")
    public ModelAndView faq_category2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/faq_category2");

        return modelAndView;
    }

    // Q1.
    @GetMapping("/category2/q1")
    public ModelAndView faq_c2_q1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category2/q1");

        return modelAndView;
    }

    // Q2.
    @GetMapping("/category2/q2")
    public ModelAndView faq_c2_q2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category2/q2");

        return modelAndView;
    }

    // Q3.
    @GetMapping("/category2/q3")
    public ModelAndView faq_c2_q3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category2/q3");

        return modelAndView;
    }

    // Q4.
    @GetMapping("/category2/q4")
    public ModelAndView faq_c2_q4() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category2/q4");

        return modelAndView;
    }

    // Q5.
    @GetMapping("/category2/q5")
    public ModelAndView faq_c2_q5() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category2/q5");

        return modelAndView;
    }

    // Category3
    @GetMapping("/category3")
    public ModelAndView faq_category3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/faq_category3");

        return modelAndView;
    }

    // Q1.
    @GetMapping("/category3/q1")
    public ModelAndView faq_c3_q1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category3/q1");

        return modelAndView;
    }

    // Q2.
    @GetMapping("/category3/q2")
    public ModelAndView faq_c3_q2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category3/q2");

        return modelAndView;
    }

    // Q3.
    @GetMapping("/category3/q3")
    public ModelAndView faq_c3_q3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category3/q3");

        return modelAndView;
    }

    // Q4.
    @GetMapping("/category3/q4")
    public ModelAndView faq_c3_q4() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category3/q4");

        return modelAndView;
    }

    // Q5.
    @GetMapping("/category3/q5")
    public ModelAndView faq_c3_q5() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/faq/category3/q5");

        return modelAndView;
    }
}
