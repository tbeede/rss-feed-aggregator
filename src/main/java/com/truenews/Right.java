package com.truenews;

import java.util.ArrayList;
import java.util.List;

public class Right {
    private String fox = "http://feeds.foxnews.com/foxnews/politics";
    private String blaze = "https://www.theblaze.com/rss";
    private String nr = "https://www.nationalreview.com/rss.xml";

    public String getFox() {
        return fox;
    }

    public void setFox(String fox) {
        this.fox = fox;
    }

    public String getBlaze() {
        return blaze;
    }

    public void setBlaze(String blaze) {
        this.blaze = blaze;
    }

    public String getNR() {
        return nr;
    }

    public void setNR(String nr) {
        this.nr = nr;
    }

}
