package com.websoul.resgatos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonateController {
    
    @GetMapping("/donate")
    public String openDonatePage() {
        return "/donate-page/index";
    }
}
