package com.example.sid.suvenrnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String varialbele1, variable2, variable3;
    int ageVar = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varialbele1 = "";
        variable2 = "";
        variable3 = "";
        ageVar = 25;
    }
}
