package com.example.app_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterlogin extends AppCompatActivity {
private Button button4;
private Button button2;
private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
        button4  =findViewById(R.id.button4);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencam();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmap();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

    }
    public void openMainActivity(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    public void openmap(){
        Intent intent =new Intent(this, map.class);
        startActivity(intent);
    }
    public void opencam(){
        Intent intent=new Intent(this,cam.class);
        startActivity(intent);

    }
}
