package com.example.uas_mobile_programing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView tombol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        tombol = findViewById(R.id.tombol);
        tombol.setOnNavigationItemSelectedListener(this);
        tombol.setSelectedItemId(R.id.menu_home);
        LinearLayout linearLayout = findViewById(R.id.llkategoriBurjo);
        LinearLayout linearLayout1 = findViewById(R.id.llkategoriAngkringan);
        LinearLayout linearLayout2 = findViewById(R.id.llkategoriKafe);
        LinearLayout linearLayout3 = findViewById(R.id.llkategoriKFC);
        LinearLayout linearLayout4 = findViewById(R.id.llkategoriBurgerking);
        LinearLayout linearLayout5 = findViewById(R.id.llkategoriPadang);
        RelativeLayout relativeLayout1 = findViewById(R.id.rltmptmknterdekat);
        CircleImageView circleImageView1 = findViewById(R.id.cilivestory1);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DaftrBurjoActivity.class);
                startActivity(intent);
            }
        });
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DaftarAngkringanActivity.class);
                startActivity(intent);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(HomeActivity.this, DaftarKafeActivity.class);
                startActivity(intent);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DaftrKFCActivity.class);
                startActivity(intent);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DaftarBurgerKingActivity.class);
                startActivity(intent);
            }
        });

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DaftrPadangActivity.class);
                startActivity(intent);
            }
        });

        circleImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LiveStori1Activity.class);
                startActivity(intent);
            }
        });

        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BurjoBorneoActivity.class);
                startActivity(intent);
            }
        });

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
