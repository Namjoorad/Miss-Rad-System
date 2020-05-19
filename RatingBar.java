package com.example.mashreghi.rad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBar extends AppCompatActivity {


    com.hedgehog.ratingbar.RatingBar ratingBar2;
    TextView txtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);


        txtview=findViewById(R.id.textView2);
        ratingBar2=findViewById(R.id.ratingbar2);




        ratingBar2.setOnRatingChangeListener(new com.hedgehog.ratingbar.RatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(float RatingCount) {
                Toast.makeText(RatingBar.this, "the fill star is" + RatingCount, Toast.LENGTH_SHORT).show();

            }
        }


    );

    }



}
