package com.jarvis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4;
    EditText e1,e2;



    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int no1= Integer.parseInt(e1.getText().toString());
        int no2= Integer.parseInt(e2.getText().toString());

        int r;
        if(v.getId()==b1.getId())
        {
            r=no1+no2;
            Toast.makeText(this,"addition is "+r,Toast.LENGTH_SHORT).show();

        }
        if(v.getId()==b2.getId())
        {
            r=no1-no2;
            Toast.makeText(this,"substraction is "+r,Toast.LENGTH_SHORT).show();

        }
        if(v.getId()==b3.getId())
        {
            r=no1*no2;
            Toast.makeText(this,"product is "+r,Toast.LENGTH_SHORT).show();

        }
        if(v.getId()==b4.getId())
        {
            r=no1/no2;
            if(Float.isInfinite(r))
            {
                Toast.makeText(this,"Cannot be divided by zero" ,Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this,"Result is: " +r,Toast.LENGTH_SHORT).show();
            }

        }
    }
}
