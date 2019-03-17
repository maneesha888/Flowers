package com.example.lavanya.flowers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView rose,calla,lilly,uv;
    TextView rosetext,callatext,lillytxt,uvtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rose=findViewById(R.id.roseimg);
        calla=findViewById(R.id.callaimg);
        rosetext=findViewById(R.id.rosetext);
        callatext=findViewById(R.id.callatext);
        lilly=findViewById(R.id.lillyimg);
        lillytxt=findViewById(R.id.lillytext);
        uv=findViewById(R.id.uvimg);
        uvtxt=findViewById(R.id.uvtext);

    }
}
