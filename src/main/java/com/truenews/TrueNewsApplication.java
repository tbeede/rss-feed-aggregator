package com.truenews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

@SpringBootApplication
public class TrueNewsApplication {

    public static void main(String[] args) throws Exception {
		SpringApplication.run(TrueNewsApplication.class, args);
    }
}
