package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    EditText t1;
    TextView o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        t1 = findViewById(R.id.t1);
        o =findViewById(R.id.origin);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String temp = t1.getText().toString();
        o.setText(temp);
    }
}
