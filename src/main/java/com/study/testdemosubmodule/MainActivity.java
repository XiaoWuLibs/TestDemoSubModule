package com.study.testdemosubmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     * 启动Activity
     *
     * @param context
     */
    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_submodule);
    }
}