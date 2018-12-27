package com.eici.lifegadgets.dto;

import java.io.Serializable;

public class Author implements Serializable {

    private  String name;
    private  String intro_l;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro_l() {
        return intro_l;
    }

    public void setIntro_l(String intro_l) {
        this.intro_l = intro_l;
    }
}
