package com.example.adres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Bundle v = getIntent().getExtras();


        ImageView actPhoto = findViewById(R.id.imageView2);
        TextView actName = findViewById(R.id.act1);
        TextView actDetle = findViewById(R.id.act);

        act s = (act) v.getSerializable("act");

        actDetle.setText(s.getActdetls());
        actName.setText(s.getActname());
        actPhoto.setImageResource(s.getActphoto());
    }
}