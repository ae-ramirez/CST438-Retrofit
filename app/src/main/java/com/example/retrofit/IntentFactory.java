package com.example.retrofit;

import android.content.Context;
import android.content.Intent;

public class IntentFactory {
    public static Intent getIntent(String className,
                                   Context context,
                                   String extraValue) {
        switch (className) {
            case "MainActivity":
                return MainActivity.getIntent(context, extraValue);
            case "DemoActivity":
                return DemoActivity.getIntent(context, extraValue);
            default:
                return LoginActivity.getIntent(context, extraValue);
        }
    }
}
