package com.example.exampractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed_firstname;
    EditText ed_lastname;
    EditText ed_city;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_submit=findViewById(R.id.btn_submit);

        ed_firstname=findViewById(R.id.firstname);
        ed_lastname=findViewById(R.id.lastname);
        ed_city=findViewById(R.id.city);

        TextView txt_output=findViewById(R.id.textView_output);


        // alert method
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, want to pass data?");
        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            intent.putExtra("first_name", ed_firstname.getText().toString());
                            intent.putExtra("last_name", ed_lastname.getText().toString());
                            intent.putExtra("city", ed_city.getText().toString());
                            startActivity(intent);





                    }
                });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });



        // Create the AlertDialog
        dialog = alertDialogBuilder.create();


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validateForm()) {
                    dialog.show();
                }
                else{
                    txt_output.setText("kindly fill form correctly");

                }
            }

        });

    }
    public boolean validateForm(){
        String firstname;
        String lastname;
        String city;

        firstname=ed_firstname.getText().toString();
        lastname =ed_firstname.getText().toString();
        city=ed_firstname.getText().toString();

        if(firstname.isEmpty()){
            ed_firstname.requestFocus();
            return false;
        }else if(lastname.isEmpty()){
            ed_lastname.requestFocus();
            return false;
        }else if(city.isEmpty()){
            ed_lastname.requestFocus();
            return false;
        }

        return true;
    }

}