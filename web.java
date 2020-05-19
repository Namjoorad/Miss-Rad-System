package com.example.mashreghi.rad;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class web extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


    }

    public void Open_page(View view) {


        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://google.com/"));
        startActivity(intent);
    }
}
