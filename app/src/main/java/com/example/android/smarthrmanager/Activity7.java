package com.example.android.smarthrmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
    }
    public void skills(View view)
    {
        Intent i=new Intent(Activity7.this,Activity6.class);
        startActivity(i);
    }
}
