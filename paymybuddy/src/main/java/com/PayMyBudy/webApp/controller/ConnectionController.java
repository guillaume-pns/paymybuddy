package com.PayMyBudy.webApp.controller;

import com.PayMyBudy.service.ConnectionService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ConnectionController {

    private final ConnectionService connectionService;

    public ConnectionController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @GetMapping("/connection")
    public ModelAndView home(Model model) {

        return new ModelAndView("connection");
    }

    // @RequestMapping(value = "/registration", method = RequestMethod.POST)
    // public ModelAndView processRequest(@ModelAttribute("registrationForm") RegistrationForm form) {
    //     userService.registration(form);
    //     return new ModelAndView("login", "loginForm", new LoginForm());
    // }

}
