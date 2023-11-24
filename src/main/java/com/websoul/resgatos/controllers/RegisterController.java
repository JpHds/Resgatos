package com.websoul.resgatos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.websoul.resgatos.models.UserDTO;
import com.websoul.resgatos.repository.UserRepository;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository repositoryInstance;

    @GetMapping("/registerPage")
    public String openRegisterPage() {
        return "register/index";
    }

    @PostMapping("/registerUser")
    public String register(UserDTO userDTO, Model model) {
        UserDTO userForRegister = this.repositoryInstance.existsByEmail(userDTO.getEmail());

        if(userForRegister == null) {
            repositoryInstance.save(userDTO);
            return "redirect:/login";
        }

        model.addAttribute("errorRegister", "Já existe uma conta cadastrada com esse e-mail!");
        return "register/index";
    }
}
