package com.websoul.resgatos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgotPasswordController {

    @GetMapping("/forgot")
    public String openForgotPasswordPage() {
        return "forgot-password/index";
    }
    
}
