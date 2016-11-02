package com.astro.p0121logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button      btnOk;
    Button      btnCancel;
    TextView    tvOut;

    private static final String TAG = "astroLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "поиск вьюх по ID");
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        tvOut = (TextView) findViewById(R.id.tvOut);

        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnCancel.setOnClickListener(this);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "По id определяем кнопку вызвавшую обработчик");
        switch (view.getId()) {
            case R.id.btnCancel:
                Log.d(TAG, "была нажата CANCEL");
                tvOut.setText("-=|CANCEL|=-");
                Toast.makeText(this, "CANCEL", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnOk:
                Log.d(TAG, "была нажата OK");
                tvOut.setText("-=|OK|=-");
                Toast.makeText(this, "Ты чё тыркаешь?!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
