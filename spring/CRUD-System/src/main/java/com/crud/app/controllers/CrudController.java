package com.crud.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.GET)
    public String cadastrar() {
        return "cadastrar";
    }

    @RequestMapping(value="/cadastrar", method=RequestMethod.POST)
    public String cadastrar(Pessoa usuario) {
        csr.save(usuario);
        return "redirect:/";
    }
}
