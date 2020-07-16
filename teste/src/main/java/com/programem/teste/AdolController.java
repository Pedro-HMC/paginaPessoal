package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdolController {
    @GetMapping("/adolescencia")
    public String adol(){
        return "adolescencia";
    } 
    
}