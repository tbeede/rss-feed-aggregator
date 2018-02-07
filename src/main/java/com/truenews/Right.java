package com.truenews;

import java.util.ArrayList;

public class Right {
    private String fox = "http://feeds.foxnews.com/foxnews/politics";
    private String zero = "http://feeds.feedburner.com/zerohedge/feed";

    private final ArrayList<String> rightList = new ArrayList<>();

    public ArrayList<String> getRightList() {
        rightList.add(getFox());
        rightList.add(getZero());
        return rightList;
    }

    public String getFox() {
        return fox;
    }

    public void setFox(String fox) {
        this.fox = fox;
    }

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }
}
