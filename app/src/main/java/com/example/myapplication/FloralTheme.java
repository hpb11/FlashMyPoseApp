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

public class FloralTheme extends AppCompatActivity {
    private Button floral;
    private final int CAPTURE_IMAGE=102;
    private ImageView floralbg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floral_theme);
        floral=findViewById(R.id.floral_btn);
        floralbg=findViewById(R.id.image_clicked1);
        floral.setOnClickListener(new View.OnClickListener() {
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
                floralbg.setImageBitmap(bitmap);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    }
