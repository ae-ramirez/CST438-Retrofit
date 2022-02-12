package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String ACTIVITY_LABEL = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display the users name and a small message
        String toastValue = getIntent().getStringExtra(ACTIVITY_LABEL);
        Toast.makeText(this, toastValue, Toast.LENGTH_LONG).show();
    }

    public static Intent getIntent(Context context, String toastValue) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(MainActivity.ACTIVITY_LABEL, toastValue);

        return intent;
    }
}