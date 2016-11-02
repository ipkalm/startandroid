package com.astro.p0111resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button          botbtn;
    LinearLayout    llbot;
    TextView        btmtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botbtn = (Button) findViewById(R.id.btnBottom);
        llbot = (LinearLayout) findViewById(R.id.llBottom);
        btmtext = (TextView) findViewById(R.id.tvBottom);

        botbtn.setText(R.string.btnBottomText);
        llbot.setBackgroundResource(R.color.llBottomColor);
        btmtext.setText(R.string.tvBottomText);
    }
}
