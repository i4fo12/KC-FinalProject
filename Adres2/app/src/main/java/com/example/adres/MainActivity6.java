package com.example.adres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Bundle p = getIntent().getExtras();


        ImageView homePhoto = findViewById(R.id.imageView24);
        TextView homeName = findViewById(R.id.act14);
        TextView homeDetle = findViewById(R.id.act4);

        Home1 c = (Home1) p.getSerializable("home");

        homeDetle.setText(c.getHomedetls());
        homeName.setText(c.getHomename());
        homePhoto.setImageResource(c.getHomephoto());
    }
}
