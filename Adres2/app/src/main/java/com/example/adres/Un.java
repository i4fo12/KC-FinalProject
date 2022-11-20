package com.example.adres;

import java.io.Serializable;

public class Un implements Serializable {

    private  String Unname;
    private    String Undetls;

    public Un(String unname, String undetls) {
        Unname = unname;
        Undetls = undetls;
    }

    public String getUnname() {
        return Unname;
    }

    public void setUnname(String unname) {
        Unname = unname;
    }

    public String getUndetls() {
        return Undetls;
    }

    public void setUndetls(String undetls) {
        Undetls = undetls;
    }
}
