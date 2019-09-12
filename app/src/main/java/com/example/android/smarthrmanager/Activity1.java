package com.example.android.smarthrmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }
    public void pro_det(View view)
    {
        Intent i=new Intent(Activity1.this,Activity4.class);
        startActivity(i);
    }
}
