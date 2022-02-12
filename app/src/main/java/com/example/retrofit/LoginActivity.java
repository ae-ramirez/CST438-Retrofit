package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static final String ACTIVITY_LABEL = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void attemptLogin(View view) {
        String username = ((EditText) findViewById(R.id.lUsername)).getText().toString();
        String message = "Who needs a password anyways, " + username;
        if (username.length() == 0) message += "or a username";

        Intent intent = IntentFactory.getIntent("MainActivity", this.getApplicationContext(), message);

        startActivity(intent);
    }

    public void attemptNotLogin(View v) {
        String username = ((EditText) findViewById(R.id.lUsername)).getText().toString();
        String message = "Nothing to see here";
        Intent intent = IntentFactory.getIntent("DemoActivity", this.getApplicationContext(), message);

        startActivity(intent);
    }

    public static Intent getIntent(Context context, String toastValue) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.putExtra(LoginActivity.ACTIVITY_LABEL, toastValue);

        return intent;
    }
}