package com.example.mashreghi.rad;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mashreghi.rad.adapters.adapterpic;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {

ArrayList<Integer> pics=new ArrayList<>();
ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        pics.add(R.drawable.uni1);
        pics.add(R.drawable.uni2);
        pics.add(R.drawable.uni3);
        pics.add(R.drawable.uni4);
        pics.add(R.drawable.uni5);

        viewPager=findViewById(R.id.viewpagerpic);

        adapterpic adapterpicc=new adapterpic(getApplicationContext(),pics);
        viewPager.setAdapter(adapterpicc);
    }
}
