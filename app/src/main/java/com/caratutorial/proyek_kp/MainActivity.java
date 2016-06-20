package com.caratutorial.proyek_kp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText inusername = null;
    private EditText inpassword = null;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inusername = (EditText) findViewById(R.id.username);
        inpassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.Login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new
                        Intent(getApplicationContext(),Result.class);
                nextScreen.putExtra("username",
                        inusername.getText().toString());
                nextScreen.putExtra("password",
                        inpassword.getText().toString());
                Log.e("n", inusername.getText() + "." +
                        inpassword.getText());
                startActivity(nextScreen);
            }
        });
    }

    public static class Result extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result2);
        }
    }
}
