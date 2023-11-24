package com.websoul.resgatos.services.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class LoginInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns(
            "/",
            "/shelters",
            "/donate",
            "/forgot",
            "/login",
            "/loginAccount",
            "/registerPage",
            "/registerUser",
            "/img/**",
            "/js/**",
            "/favicon.ico",
            "/css/**"
        );
    }
}
