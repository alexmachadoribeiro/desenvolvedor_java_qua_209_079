package com.telas.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TelasController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "cadastrar";
    }
}
