package com.websoul.resgatos.controllers;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.websoul.resgatos.services.CookieService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ShelterController {
    
    @GetMapping("/shelters")
    public String openShelterPage(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        if(CookieService.getCookie(request, "userId") != null) {
            model.addAttribute("name", CookieService.getCookie(request, "userName"));
        }
            return "/shelters/index";
    }
}
