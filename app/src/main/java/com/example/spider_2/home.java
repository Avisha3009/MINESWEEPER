package com.example.spider_2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void OpenActivity(View v){
        Intent intent=new Intent (this,MainActivity.class);
        startActivity(intent);

    }

}