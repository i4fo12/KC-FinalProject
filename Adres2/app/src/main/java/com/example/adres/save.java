package com.example.adres;

import java.io.Serializable;

public class save implements Serializable {
    private  String savename;
    private  int savephoto;
    private  String savedetls;

    public save(String savename, int savephoto, String savedetls) {
        this.savename = savename;
        this.savephoto = savephoto;
        this.savedetls = savedetls;
    }

    public String getSavename() {
        return savename;
    }

    public void setSavename(String savename) {
        this.savename = savename;
    }

    public int getSavephoto() {
        return savephoto;
    }

    public void setSavephoto(int savephoto) {
        this.savephoto = savephoto;
    }

    public String getSavedetls() {
        return savedetls;
    }

    public void setSavedetls(String savedetls) {
        this.savedetls = savedetls;
    }
}
