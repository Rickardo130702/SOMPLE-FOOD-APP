package com.example.uas_mobile_programing;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvNamaDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_promo);

        PromoModel elements = (PromoModel) getIntent().getSerializableExtra("PromoModel");
        tvNamaDetail = findViewById(R.id.tvNamaDetail);


        tvNamaDetail.setText(elements.getJudulpromo());


    }
}