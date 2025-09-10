package org.g21.API.controllers;

import org.g21.API.models.User;
import org.g21.API.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String mostrarHome(HttpSession session, Model model) {
        Integer idUser = (Integer) session.getAttribute("idUser");
        if(idUser == null) {
            return "redirect:/login"; // Se não houver utilizador na sessão, redireciona para login
        }else {
            User user = userService.getUser(idUser);
            model.addAttribute("user", user);
            return "home"; // Se houver utilizador, carrega os dados e mostra a home
        }
    }

}
