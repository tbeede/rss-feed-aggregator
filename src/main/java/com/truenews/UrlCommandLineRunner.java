package com.truenews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class UrlCommandLineRunner implements CommandLineRunner {

    private final UrlRepository repository;

    public UrlCommandLineRunner(UrlRepository urlRepository){
        this.repository = urlRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("test1.com", "test2.com", "test3.com").forEach(urlName ->
                repository.save(new Url(urlName))
        );
        repository.findAll().forEach(System.out::println);
    }
}
