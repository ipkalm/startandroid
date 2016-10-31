package com.astro.p0102activitylistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView    tvOut;
    Button      btnOk;
    Button      btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut       = (TextView) findViewById(R.id.tvOut);
        btnOk       = (Button) findViewById(R.id.btnOk);
        btnCancel   = (Button) findViewById(R.id.btnCancel);

        tvOut.setText("Default Text");

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOk:
                tvOut.setText("\'OK\' was pressed");
                break;
            case R.id.btnCancel:
                tvOut.setText("\'Cancel\' was pressed");
                break;
            default:
                tvOut.setText("default in switch");
        }
    }
}
