package com.example.uas_mobile_programing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BurjoBorneoActivity extends AppCompatActivity {

    Button btnPeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burjo_borneo);

        btnPeta = findViewById(R.id.btnPeta);


        btnPeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/1wK7kPtPg8TbiEyN9"));
                startActivity(Intent.createChooser(intent, "title"));
            }
        });


    }
}