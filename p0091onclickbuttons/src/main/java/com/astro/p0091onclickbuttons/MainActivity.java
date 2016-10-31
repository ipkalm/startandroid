package com.astro.p0091onclickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button      btnCancel;
    Button      btnOk;
    TextView    tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCancel   = (Button) findViewById(R.id.btnCancel);
        btnOk       = (Button) findViewById(R.id.btnOk);

        tvOut       = (TextView) findViewById(R.id.tvOut);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO write code
                tvOut.setText("\"OK\" button was pressed");
            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("\"Cancel\" button was pressed");
            }
        };

        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}
