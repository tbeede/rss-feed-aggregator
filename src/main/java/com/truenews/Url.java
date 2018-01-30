package com.truenews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Url {

    @Id
    @GeneratedValue
    private Long id;
    private String urlName;

    public Url() {}

    public Url(String urlName) {
        this.urlName = urlName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

//    @Override
//    public String toString(){
//        return "urlName";
//    }
}
