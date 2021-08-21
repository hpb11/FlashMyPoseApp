package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Smoke_theme extends AppCompatActivity {
    private Button smoke;
    private final int CAPTURE_IMAGE=102;
    private ImageView smokebg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoke_theme);
        smoke=findViewById(R.id.smoke_btn);
        smokebg=findViewById(R.id.smoke_image);
      smoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAPTURE_IMAGE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==CAPTURE_IMAGE)
        {
            if(data!=null && data.getExtras()!=null ) {
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                smokebg.setImageBitmap(bitmap);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    }
