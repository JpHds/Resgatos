package com.websoul.resgatos.services.auth;

import org.springframework.web.servlet.HandlerInterceptor;

import com.websoul.resgatos.services.CookieService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("Pre Handle method is Calling");

        if (CookieService.getCookie(request, "userId") != null) {
            return true;
        }

        response.sendRedirect("/login");
        return false;
    }


}