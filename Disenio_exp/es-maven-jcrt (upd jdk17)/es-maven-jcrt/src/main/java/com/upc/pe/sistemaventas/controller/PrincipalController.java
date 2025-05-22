package com.upc.pe.sistemaventas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrincipalController {
	
	@GetMapping({"/", "/index"})
    public String principal(Model model, @RequestParam(value="name", required=false, defaultValue="funciona") String name) {
        //logica 
        model.addAttribute("name", name);
        return "redirect:/vender/";
    }
	
}
