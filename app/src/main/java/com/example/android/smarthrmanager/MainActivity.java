package com.example.android.smarthrmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public EditText Username;
    public EditText Password;
    public Button b;
    String user,pass;

    public void login(View view) {
        Username= (EditText) findViewById(R.id.User);
        Password= (EditText) findViewById(R.id.Pass);
        b = (Button) findViewById(R.id.Log);
        user= Username.getText().toString();
        pass=Password.getText().toString();
        validate(user,pass);

    }
    public void validate(String user,String pass)
    {
        if((user.equals("employee") && (pass.equals("ep1"))))
        {
            Intent i=new Intent(MainActivity.this,Activity1.class);
            startActivity(i);
        }
        if((user.equals("manager") && (pass.equals("mp1"))))
        {
            Intent i=new Intent(MainActivity.this,Activity2.class);
            startActivity(i);
        }
        if((user.equals("admin") && (pass.equals("ap1"))))
        {
            Intent i=new Intent(MainActivity.this,Activity3.class);
            startActivity(i);
        }
    }
}
