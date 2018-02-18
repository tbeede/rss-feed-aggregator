package com.truenews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.truenews.RSSParser.readRssFeed;

@Controller
public class RSSController {
    @GetMapping(value = "/")
    public String rssForm(Model model) throws Exception {
        Left left = new Left();
        String readCNNFeed = readRssFeed(left.getCnn());
        String readNYTFeed = readRssFeed(left.getNyt());
        String readWAPOFeed = readRssFeed(left.getWaPo());
        model.addAttribute("leftParserCNNFeed",readCNNFeed);
        model.addAttribute("leftParserNYTFeed", readNYTFeed);
        model.addAttribute("leftParserWAPOFeed", readWAPOFeed);

        Right right = new Right();
        String readFOXFeed = readRssFeed(right.getFox());
        String readBLAZEFeed = readRssFeed(right.getBlaze());
        String readNRFeed = readRssFeed(right.getNR());
        model.addAttribute("rightParserFOXFeed", readFOXFeed);
        model.addAttribute("rightParserBLAZEFeed", readBLAZEFeed);
        model.addAttribute("rightParserNRFeed", readNRFeed);

        return "index";
    }
}