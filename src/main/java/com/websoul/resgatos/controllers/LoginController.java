package com.websoul.resgatos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websoul.resgatos.models.UserDTO;
import com.websoul.resgatos.repository.UserRepository;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    
    @Autowired
    private UserRepository repositoryInstance;

    @GetMapping("/login")
    public String openLoginPage() {
        return "login/index";
    }

    @PostMapping("/loginAccount")
    public String loginInAccount(UserDTO userParam,
    @RequestParam(value = "remember", defaultValue = "false")
    boolean remember, Model model, HttpServletResponse response) {
        UserDTO user = this.repositoryInstance.loginValidator(userParam.getEmail(), userParam.getPassword());

        if (user != null) {
            return "redirect:/";
        }
        model.addAttribute("erro", "Usuário e/ou senha inválidos.");
        return "/login/index";
    }
}
