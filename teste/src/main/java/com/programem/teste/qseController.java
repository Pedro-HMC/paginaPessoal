package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class qseController {
    @GetMapping("/quemsoueu")
    public String qse(){
        return "quemsoueu";
    }
    
}