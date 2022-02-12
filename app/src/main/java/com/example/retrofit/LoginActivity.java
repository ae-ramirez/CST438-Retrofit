package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void DoLogin(View view) {
        String username = ((EditText) findViewById(R.id.lUsername)).getText().toString();
        String message = "Who needs a password anyways, " + username;
        Intent intent = IntentFactory.getIntent("MainActivity", this.getApplicationContext(), message);

        startActivity(intent);
    }
}