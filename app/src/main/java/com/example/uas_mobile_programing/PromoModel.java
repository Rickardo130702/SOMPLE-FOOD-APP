package com.example.uas_mobile_programing;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class PromoModel implements Serializable {
    public String judulpromo;


    public PromoModel(String judulpromo) {
        this.judulpromo = judulpromo;


    }

    public String getJudulpromo() {
        return judulpromo;
    }

    public void setJudulpromo(String judulpromo) {
        this.judulpromo = judulpromo;
    }



}

