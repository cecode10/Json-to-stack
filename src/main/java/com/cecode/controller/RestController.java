package com.cecode.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class RestController {

    @PostMapping("/format/json")
    public String convertToStack(@RequestParam String inputJson, Model model) throws IOException {
        return null;
    }
}
