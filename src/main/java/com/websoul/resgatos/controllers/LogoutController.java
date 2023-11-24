package com.websoul.resgatos.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.websoul.resgatos.services.CookieService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LogoutController {
    @GetMapping("/logout")
    public String logout(HttpServletResponse response) throws IOException {
        CookieService.setCookie(response, "userId", "", 0);
        CookieService.setCookie(response, "userName", "", 0);
        return "redirect:/";
    }
}
