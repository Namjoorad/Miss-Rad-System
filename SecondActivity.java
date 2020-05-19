package com.example.mashreghi.rad;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageViewimgpic =(ImageView) findViewById(R.id.imgpic);
        ImageView imageView8 =(ImageView) findViewById(R.id.img8);
        ImageView imageView1 =(ImageView) findViewById(R.id.img1);
        ImageView imageView7 =(ImageView) findViewById(R.id.img7);
        ImageView imageView5 =(ImageView) findViewById(R.id.img5);
        ImageView imageView4 =(ImageView) findViewById(R.id.img4);
        imageView1.bringToFront();
        imageView7.bringToFront();
        imageView5.bringToFront();
        imageView4.bringToFront();
        imageView8.bringToFront();
        imageViewimgpic.bringToFront();


        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eightIntent = new Intent(SecondActivity.this, Register.class);
                startActivity(eightIntent);

            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SecondActivity.this, ListStudent.class);
                startActivity(myIntent);

            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://google.com/"));
                startActivity(intent);


            }
        });
        imageViewimgpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sixIntent = new Intent(SecondActivity.this, Gallery.class);
                startActivity(sixIntent);


            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fiveIntent = new Intent(SecondActivity.this, RatingBar.class);
                startActivity(fiveIntent);

            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourIntent = new Intent(SecondActivity.this, aboutwe.class);
                startActivity(fourIntent);

            }
        });

        }
    }



