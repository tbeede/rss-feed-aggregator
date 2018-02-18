package com.truenews;

public class Left {
    private String cnn = "http://rss.cnn.com/rss/cnn_allpolitics.rss";
    private String nyt = "http://rss.nytimes.com/services/xml/rss/nyt/Politics.xml";
    private String waPo = "http://feeds.washingtonpost.com/rss/politics";

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

    public String getWaPo() {
        return waPo;
    }

    public void setWaPo(String waPo) {
        this.waPo = waPo;
    }

}
