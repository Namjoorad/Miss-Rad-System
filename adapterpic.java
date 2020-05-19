package com.example.mashreghi.rad.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mashreghi.rad.R;

import java.util.ArrayList;

public class adapterpic  extends PagerAdapter{

    Context context;
    ArrayList<Integer> picsadapter;
    LayoutInflater inflater;

    public adapterpic(Context context, ArrayList<Integer> picsadapter) {

        this.context=context;
        this.picsadapter=picsadapter;
        inflater=LayoutInflater.from(context);
    }






    @Override
    public int getCount() {
        return picsadapter.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object Object) {
        return view.equals(Object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view=inflater.inflate(R.layout.itempic,null);
        ImageView imageView=view.findViewById(R.id.imagepic);
        imageView.setBackgroundResource(picsadapter.get(position));

        container.addView(view);

        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {


        container.removeView((View) object);
    }
}
