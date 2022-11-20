package com.example.adres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle t = getIntent().getExtras();

        TextView UnName = findViewById(R.id.Un);
        TextView UnDetle = findViewById(R.id.Un1);

        Un de = (Un) t.getSerializable("Un");

        UnDetle.setText(de.getUndetls());
        UnName.setText(de.getUnname());

    }
}