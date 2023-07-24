package com.example.uas_mobile_programing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        tombol = findViewById(R.id.tombol);
        tombol.setOnNavigationItemSelectedListener(this);
        tombol.setSelectedItemId(R.id.menu_home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_home) {
            return false;
        } else if (item.getItemId() == R.id.menu_promo) {
            startActivity(new Intent(getApplicationContext(), PromoActivity.class));
        } else if (item.getItemId() == R.id.menu_favorite) {
            startActivity(new Intent(getApplicationContext(), FavoriteActivity.class));
        } else if (item.getItemId() == R.id.menu_profile) {
            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
        }

        return false;
    }



}
