package com.example.mashreghi.rad;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Register extends AppCompatActivity {

    EditText etlname, etfamily, etnumber;
    TextView view1, view2;
    ListView listview1;
    String filename = "NamjooRad";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etlname = (EditText) findViewById(R.id.etlname);
        etfamily = (EditText) findViewById(R.id.etfamily);
        etnumber = (EditText) findViewById(R.id.etnumber);
        listview1 = findViewById(R.id.listview1);

        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);
        File direction = getFilesDir();
        String path = direction.getAbsolutePath();
        view1.setText(path);
        view2.setText(getFilesDir().toString());


    }


    public void saveInfo(View view) {
        JSONArray array = new JSONArray();
        JSONObject object = new JSONObject();
        try {
            object.put("Name", etlname.getText().toString());
            object.put("Family", etfamily.getText().toString());
            object.put("Number", etnumber.getText().toString());

            array.put(object);


            //   String value = array.toString();
            //      view1.setText(value);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public void writefile() {
        String content = "Android Studiooooooooooooo";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();

        } catch (Exception e) {
            view1.setText(e + "");

        }
    }

    public void readfile() {
        BufferedReader bufferedReader = null;
        File filenameTwo = new File(getFilesDir(), filename);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filenameTwo)));

            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);

            }
            view1.setText(buffer.toString());


        } catch (Exception e) {
            view1.setText(e + "");
        }
    }

    public void reportclick(View view) {
        JSONArray array = new JSONArray();
        JSONObject object = new JSONObject();
        try {
            object.put("Name", etlname.getText().toString());
            object.put("Family", etfamily.getText().toString());
            object.put("Number", etnumber.getText().toString());

            array.put(object);


            String value = array.toString();
            view1.setText(value);


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}