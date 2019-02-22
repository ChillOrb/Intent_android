package com.example.raksh.intent;

import android.content.Intent;
import android.support.v7.appcompat.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        Intent myintent=new Intent(this,Activity2.class);
        startActivity(myintent);

    }


}
