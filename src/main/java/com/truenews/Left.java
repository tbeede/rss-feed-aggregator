package com.truenews;

import java.util.ArrayList;

public class Left {
    private String cnn = "http://rss.cnn.com/rss/cnn_allpolitics.rss";
    private String nyt = "http://rss.nytimes.com/services/xml/rss/nyt/Politics.xml";

    private final ArrayList<String> leftList = new ArrayList<>();

    public ArrayList<String> getLeftList() {
        leftList.add(getCnn());
        leftList.add(getNyt());
        return leftList;
    }

    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    public String getNyt() {
        return nyt;
    }

    public void setNyt(String nyt) {
        this.nyt = nyt;
    }
}
