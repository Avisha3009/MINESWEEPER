package com.example.spider_2;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.spider_2.views.GameEngine;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","onCreate");
        GameEngine.getInstance().createGrid(this);
    }
}