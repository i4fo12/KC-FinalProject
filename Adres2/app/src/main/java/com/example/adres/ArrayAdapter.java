package com.example.adres;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ArrayAdapter extends android.widget.ArrayAdapter<food1> {

    List<food1> food1List;

    public ArrayAdapter(@NonNull Context context, int resource, @NonNull List<food1> objects) {
        super(context, resource, objects);
        food1List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

     View view = LayoutInflater.from(getContext()).inflate(R.layout.ghj,parent,false);

      food1 currentFood = food1List.get(position);

        TextView foodname = view.findViewById(R.id.x7);
        ImageView Img = view.findViewById(R.id.im1);

        foodname.setText(currentFood.getFoodname());
        Img.setImageResource(currentFood.getFoodphoto());


        return view;
    }
}
