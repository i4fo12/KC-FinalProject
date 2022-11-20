package com.example.adres;

import java.io.Serializable;

public class act implements Serializable {
    private  String actname;
    private  int actphoto;
    private    String actdetls;

    public act(String actname, int actphoto, String actdetls) {
        this.actname = actname;
        this.actphoto = actphoto;
        this.actdetls = actdetls;
    }

    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname;
    }

    public int getActphoto() {
        return actphoto;
    }

    public void setActphoto(int actphoto) {
        this.actphoto = actphoto;
    }

    public String getActdetls() {
        return actdetls;
    }

    public void setActdetls(String actdetls) {
        this.actdetls = actdetls;
    }
}
