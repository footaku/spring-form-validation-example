package com.example.panage.spring.controller;

import com.example.panage.spring.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fu-taku
 */
@Controller
@RequestMapping("/")
public class ValidationController {

    @GetMapping
    public String index(@ModelAttribute Form form) {
        return "index";
    }

    @PostMapping
    public String post(@Validated @ModelAttribute Form form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        return "end";
    }
}
