package com.truenews;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class RSSParser {
    // For testing
    public static void main(String[] args) {
        readRSSFeed();
    }
    public static String readRSSFeed() {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc = null;
        Left left = new Left();
        try {
            builder = domFactory.newDocumentBuilder();
//            doc = builder.parse("http://rss.nytimes.com/services/xml/rss/nyt/Politics.xml");
            doc = builder.parse(left.getCnn());
        }
        catch (SAXException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        XPath xpath = XPathFactory.newInstance().newXPath();
        getNodeNameAndValue(doc, xpath);

        return null;
    }

    private static void getNodeNameAndValue(Document doc, XPath xpath){
        XPathExpression expr;
        Object result = null;
        try {
            expr = xpath.compile("//channel/*/url/text()");
            result = expr.evaluate(doc, XPathConstants.NODESET);
        }
        catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        NodeList nodes = (NodeList) result;

        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getParentNode().getNodeName() + " " + nodes.item(i).getNodeValue());
        }
    }
}