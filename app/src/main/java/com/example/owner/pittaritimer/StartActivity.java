package com.example.owner.pittaritimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Intent intent = getIntent();
    }

    public void move (View v){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("minutes",10);
        startActivity(intent) ;


    }


}
