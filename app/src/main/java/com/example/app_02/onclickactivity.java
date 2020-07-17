package com.example.app_02;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class onclickactivity extends AppCompatActivity {
    private static final String TAG = "onclickactivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_click);
        Log.d(TAG,"OnCreate: started");
        getIncomingIntent();

    }
    private void getIncomingIntent(){
        Log.d(TAG,"getIncomingIntent: checking for incoming intents.");
        if (getIntent().hasExtra("Emp_name")&& getIntent().hasExtra("Emp_sal") && getIntent().hasExtra("Emp_age") && getIntent().hasExtra("Emp_dob")&& getIntent().hasExtra("Emp_date")&& getIntent().hasExtra("Emp_phone")){
            String empname=getIntent().getStringExtra("Emp_name");
            String empsal=getIntent().getStringExtra("Emp_sal");
            String empage=getIntent().getStringExtra("Emp_age");
            String empdob=getIntent().getStringExtra("Emp_dob");
            String empdate=getIntent().getStringExtra("Emp_date");
            String empphone=getIntent().getStringExtra("Emp_phone");
            setEmp(empname,empsal,empage,empdob,empdate,empphone);
        }

    }
    private void setEmp(String empname, String empsal, String empage, String empdob, String empdate, String empphone){
        TextView name=findViewById(R.id.txtUser);
        name.setText(empname);
        TextView sal=findViewById(R.id.salUser);
        sal.setText(empsal);
        TextView age=findViewById(R.id.ageUser);
        age.setText(empage);
        TextView dob=findViewById(R.id.dobUser);
        dob.setText(empdob);
        TextView date=findViewById(R.id.dateUser);
        date.setText(empdate);
        TextView phone=findViewById(R.id.phoneUser);
        phone.setText(empphone);

    }


}
