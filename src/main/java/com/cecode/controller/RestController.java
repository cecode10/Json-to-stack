package com.cecode.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cecode.util.LogEntryFormatter;

@Controller
@RequestMapping
public class RestController {

    @PostMapping("/format/json")
    public String convertToStack(@RequestParam String inputJson,  Model model) throws IOException {
        try {
            final List<String> exceptionLines = LogEntryFormatter.extractStackFromJson(inputJson);
            model.addAttribute("exceptionLines", exceptionLines);
            return "stack-trace";

        } catch (Exception e) {
            throw e;
            //return new String[]{"Ups something went wrong!, " + e.getMessage()};
        }
    }
}
