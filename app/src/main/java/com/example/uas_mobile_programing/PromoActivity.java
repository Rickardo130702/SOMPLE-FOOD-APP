package com.example.uas_mobile_programing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PromoActivity extends AppCompatActivity {

    List<PromoModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promo);

        ImageView imageView = findViewById(R.id.ivArrowBack);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PromoActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new PromoModel("Promo Fiesta Steak Combo Steak Mulai Dari Rp 75 Ribuan"));
        elements.add(new PromoModel("Beli 2 gratis sepuanya"));
        elements.add(new PromoModel("Beli 2 gratis 3"));
        elements.add(new PromoModel("Beli 1 gratis Sepuasnya"));
        elements.add(new PromoModel("Beli 2 gratis 3"));
        elements.add(new PromoModel("Beli 1 gratis Sepuasnya"));
        elements.add(new PromoModel("Beli 2 gratis 3"));
        elements.add(new PromoModel("Beli 1 gratis Sepuasnya"));

        PromoAdapter adapter = new PromoAdapter(elements, this, new PromoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(PromoModel item) {
                detail(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.rvContact);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void detail(PromoModel item) {
        Intent intent = new Intent(PromoActivity.this, DetailActivity.class);
        intent.putExtra("PromoModel", item);
        startActivity(intent);
    }
}







