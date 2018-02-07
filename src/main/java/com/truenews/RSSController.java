package com.truenews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class RSSController {
    @GetMapping(value = "/")
    public String rssForm(Model model) {
        Left left = new Left();
        Right right = new Right();
        ArrayList getLeft = left.getLeftList();
        ArrayList getRight = right.getRightList();
        model.addAttribute("leftParser", getLeft);
        model.addAttribute("rightParser", getRight);
        return "index";
    }
}