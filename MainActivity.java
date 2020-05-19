package com.example.mashreghi.rad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter=5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name=(EditText)findViewById(R.id.tvName);
        Password=(EditText)findViewById(R.id.tvPassword);
        Login=(Button)findViewById(R.id.btnLogin) ;
        Info=(TextView)findViewById(R.id.tvInfo);

        Info.setText("تعداد دفعات مجاز برای ورود: 5 ");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void validate(String username,String password){

        if ((username.equals("Admin"))&&(password.equals("123"))){
             Intent Intent=new Intent(MainActivity.this,SecondActivity.class);
             startActivity(Intent);}
        else {
           counter--;
           Info.setText("تعداد دفعات مجاز برای ورود :  "+ String.valueOf(counter));
           if(counter==0){
           Login.setEnabled(false);
       }
    }




    }
}
