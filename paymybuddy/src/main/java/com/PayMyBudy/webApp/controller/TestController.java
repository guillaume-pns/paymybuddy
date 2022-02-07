package com.PayMyBudy.webApp.controller;

import com.PayMyBudy.service.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
    
    @GetMapping("/test")
    public ModelAndView home(Model model) {

        return new ModelAndView("test");
    }

}
