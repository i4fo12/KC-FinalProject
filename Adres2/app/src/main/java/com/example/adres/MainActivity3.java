package com.example.adres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle b = getIntent().getExtras();


        ImageView savePhoto = findViewById(R.id.gh);
        TextView saveName = findViewById(R.id.we);
        TextView saveDetle = findViewById(R.id.df);

        save de = (save) b.getSerializable("save");

        saveDetle.setText(de.getSavedetls());
        saveName.setText(de.getSavename());
        savePhoto.setImageResource(de.getSavephoto());
    }
}