package com.truenews;

import com.rometools.rome.io.FeedException;
import org.junit.Test;

import java.io.IOException;

public class RSSParserTest {
    @Test
    public void testRSSUrl() throws IOException, FeedException {
        String testUrl = new Left().getCnn();
        System.out.println(new RSSParser().readRssFeed(testUrl));
    }
}
