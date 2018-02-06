package com.truenews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RSSController {
    @GetMapping(value = "/")
    public String rssForm(Model model) {
        model.addAttribute("rssParser", new RSSParser());
        return "index";
    }
}