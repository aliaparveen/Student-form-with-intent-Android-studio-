package com.example.exampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String fname;
        String lname;
        String city;

        fname=getIntent().getStringExtra("first_name");
        lname=getIntent().getStringExtra("last_name");
        city=getIntent().getStringExtra("city");


        TextView txt_fname=findViewById(R.id.home2_firstname);
        TextView txt_lname=findViewById(R.id.home2_lastname);
        TextView txt_city=findViewById(R.id.home2_city);

        txt_fname.setText(txt_fname.getText().toString()+""+fname);
        txt_lname.setText(txt_lname.getText().toString()+""+lname);
        txt_city.setText(txt_city.getText().toString()+""+city);


    }
}