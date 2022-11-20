package com.example.adres;

import java.io.Serializable;

public class food1 implements Serializable {
    private  String foodname;
    private  int foodphoto;
    private    String fooddetls;

    public food1(String foodname, int foodphoto, String fooddetls) {
        this.foodname = foodname;
        this.foodphoto = foodphoto;
        this.fooddetls = fooddetls;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getFoodphoto() {
        return foodphoto;
    }

    public void setFoodphoto(int foodphoto) {
        this.foodphoto = foodphoto;
    }

    public String getFooddetls() {
        return fooddetls;
    }

    public void setFooddetls(String fooddetls) {
        this.fooddetls = fooddetls;
    }
}
