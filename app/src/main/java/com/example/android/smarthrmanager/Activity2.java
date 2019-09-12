package com.example.android.smarthrmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void pro_ass(View view)
    {
        Intent i=new Intent(Activity2.this,Activity7.class);
        startActivity(i);
    }
    public void list_e(View view)
    {
        Intent i=new Intent(Activity2.this,Activity5.class);
        startActivity(i);
    }
    public void Terminate(View view)
    {
        Intent i=new Intent(Activity2.this,Activity8.class);
        startActivity(i);
    }
}
