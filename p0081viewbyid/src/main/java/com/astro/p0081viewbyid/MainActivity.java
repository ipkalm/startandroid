package com.astro.p0081viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextview = (TextView) findViewById(R.id.myID);

        myTextview.setText("suka blya");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("sho tam?");
    }
}
