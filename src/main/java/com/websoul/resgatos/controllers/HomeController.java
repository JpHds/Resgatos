package com.websoul.resgatos.controllers;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.websoul.resgatos.services.CookieService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String openHomePage(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        model.addAttribute("name", CookieService.getCookie(request, "userName"));
        return "home/index";
    }
}
