package com.truenews;

import com.truenews.Url;
import org.hibernate.type.CollectionType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class UrlController {
    private UrlRepository urlRepository;

    public UrlController(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @GetMapping(value = "/")
    public Collection<Url> listUrls() {
        return urlRepository.findAll()
                .stream()
                .collect(Collectors.toList());
    }

//    @GetMapping(value = "/")
//    public String index() {
//        return "index";
//    }
}