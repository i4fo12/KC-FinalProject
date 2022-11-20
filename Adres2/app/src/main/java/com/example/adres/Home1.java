package com.example.adres;

import java.io.Serializable;

public class Home1 implements Serializable {
    private  String homename;
    private  int homephoto;
    private    String homedetls;

    public Home1(String homename, int homephoto, String homedetls) {
        this.homename = homename;
        this.homephoto = homephoto;
        this.homedetls = homedetls;
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename;
    }

    public int getHomephoto() {
        return homephoto;
    }

    public void setHomephoto(int homephoto) {
        this.homephoto = homephoto;
    }

    public String getHomedetls() {
        return homedetls;
    }

    public void setHomedetls(String homedetls) {
        this.homedetls = homedetls;
    }
}
