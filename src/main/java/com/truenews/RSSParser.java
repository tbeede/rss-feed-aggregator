package com.truenews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class RSSParser {
    public static String readRSSFeed() {


        return null;
    }

//    public static String readFeed(String url) {
//        try {
//            URL rssUrl = new URL(url);
//            BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
//            String sourceCode = "";
//            String line;
//            while ((line = in.readLine()) != null) {
//                int titleEndIndex = 0;
//                int titleStartIndex = 0;
//                while (titleStartIndex >= 0) {
//                    titleStartIndex = line.indexOf("<url>", titleEndIndex);
//                    if (titleStartIndex >= 0) {
//                        titleEndIndex = line.indexOf("</url>", titleStartIndex);
//                        sourceCode += line.substring(titleStartIndex + "<url>".length(), titleEndIndex) + "\n";
//                    }
//                }
//            }
//            in.close();
//            return sourceCode;
//        } catch (MalformedURLException ue) {
//            System.out.println("Malformed URL");
//        } catch (IOException ioe) {
//            System.out.println("Something went wrong reading the contents");
//        }
//        return null;
//    }
}