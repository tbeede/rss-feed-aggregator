package com.truenews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.truenews.RSSParser.readRSSFeed;

@Controller
public class UrlController {
    @GetMapping(value = "/")
    public String rssForm(Model model) {
        model.addAttribute("rssParser", new RSSParser());
        String rssTest = "http://rss.cnn.com/rss/edition.rss";
        readRSSFeed(rssTest);
        return "index";
    }

}