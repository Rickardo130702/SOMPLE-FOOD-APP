package com.example.uas_mobile_programing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class DaftrBurjoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftr_burjo);

        ImageView imageView = findViewById(R.id.ivArrowBack2);
        RelativeLayout relativeLayout = findViewById(R.id.rlBurjoBorneo);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftrBurjoActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftrBurjoActivity.this, BurjoBorneoActivity.class);
                startActivity(intent);
            }
        });
    }
}