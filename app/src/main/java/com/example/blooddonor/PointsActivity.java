package com.example.blooddonor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PointsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button newAppt;
    private Button myAppt;
    private Button notiAppt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        newAppt = (Button) findViewById(R.id.newAppt);
        newAppt.setOnClickListener(this);
        myAppt = (Button) findViewById(R.id.myAppt);
        myAppt.setOnClickListener(this);
        notiAppt = (Button) findViewById(R.id.notiAppt);
        notiAppt.setOnClickListener(this);

        newAppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PointsActivity.this, NewApptActivity.class));
            }
        });

        myAppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PointsActivity.this, myApptActivity.class));
            }
        });

        notiAppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PointsActivity.this, notiApptActivity.class));
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.newAppt:
                startActivity(new Intent(this, NewApptActivity.class));
                break;
        }
    }
}