package com.example.blooddonor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class appointmentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button newAppt;
    private Button myAppt;
    private Button notiAppt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        newAppt = (Button) findViewById(R.id.newAppt);
        newAppt.setOnClickListener(this);
        myAppt = (Button) findViewById(R.id.myAppt);
        myAppt.setOnClickListener(this);
        notiAppt = (Button) findViewById(R.id.notiAppt);
        notiAppt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(appointmentActivity.this, NewApptActivity.class));
        startActivity(new Intent(appointmentActivity.this, myApptActivity.class));
        startActivity(new Intent(appointmentActivity.this, notiApptActivity.class));
    }

}