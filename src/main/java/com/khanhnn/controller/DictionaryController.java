package com.khanhnn.controller;

import com.khanhnn.service.DictionaryService;
import com.khanhnn.service.DictionaryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/result")
    public String translate(@RequestParam String word, Model model){
        DictionaryService service= new DictionaryServiceImpl();
        String result=service.find(word);
        model.addAttribute("result", result);
        return "result";
    }
}
