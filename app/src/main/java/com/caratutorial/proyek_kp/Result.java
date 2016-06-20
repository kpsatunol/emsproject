package com.caratutorial.proyek_kp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        TextView txtName = (TextView) findViewById(R.id.username);
        TextView txtEmail = (TextView) findViewById(R.id.password);
        Intent intent = getIntent();
// Receiving the Data
        String Ousername = intent.getStringExtra("username");
        String Opassword = intent.getStringExtra("password");
        Log.e("Second Screen", Ousername + "." + Opassword);
// Displaying Received data
        txtName.setText(Ousername);
        txtEmail.setText(Opassword);
    }
}
