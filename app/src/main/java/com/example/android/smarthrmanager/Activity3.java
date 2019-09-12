package com.example.android.smarthrmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void pro_cre(View view)
    {
        Intent i=new Intent(Activity3.this,Activity9.class);
        startActivity(i);
    }
    public void list_em(View view)
    {
        Intent i=new Intent(Activity3.this,Activity10.class);
        startActivity(i);
    }
    public void newEmp(View view)
    {
        Intent i=new Intent(Activity3.this,Activity11.class);
        startActivity(i);
    }
}
