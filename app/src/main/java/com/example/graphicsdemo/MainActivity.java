package com.example.graphicsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    MySurfaceView msv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        msv = findViewById(R.id.sv);

        findViewById(R.id.cc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //msv.changeColor();
            }
        });

    }


}
