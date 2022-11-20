package com.example.adres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        ImageView foodPhoto = findViewById(R.id.hj);
        TextView foodName = findViewById(R.id.lk);
        TextView foodDetle = findViewById(R.id.mn);

        food1 d = (food1) bundle.getSerializable("food");

        foodName.setText(d.getFoodname());
        foodDetle.setText(d.getFooddetls());
        foodPhoto.setImageResource(d.getFoodphoto());

    }
}