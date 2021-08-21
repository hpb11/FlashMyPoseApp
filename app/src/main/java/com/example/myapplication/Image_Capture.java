package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Image_Capture extends AppCompatActivity {
    private ImageButton black,floral,blue,nature,cloud,smoky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_capture);
        black=findViewById(R.id.black_btn);
        floral=findViewById(R.id.floral_btn);
        nature=findViewById(R.id.nature_btn);
        cloud=findViewById(R.id.cloud_btn);
        blue=findViewById(R.id.blue_btn);
        smoky=findViewById(R.id.smoky_btn);
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Image_Capture.this,Black_theme.class);
                startActivity(intent);
            }
        });
        floral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Image_Capture.this,FloralTheme.class);
                startActivity(intent);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Image_Capture.this,BlueActivity.class);
                startActivity(intent);
            }
        });
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Image_Capture.this,Nature_theme.class);
                startActivity(intent);
            }
        });
        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Image_Capture.this,Cloud_Theme.class);
                startActivity(intent);
            }
        });
        smoky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Image_Capture.this,Smoke_theme.class);
                startActivity(intent);
            }
        });

    }
}