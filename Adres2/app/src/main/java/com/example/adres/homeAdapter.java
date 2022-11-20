package com.example.adres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class homeAdapter extends ArrayAdapter<Home1> {

    List<Home1> Home1List;

    public homeAdapter(@NonNull Context context, int resource, @NonNull List<Home1> objects) {
        super(context, resource, objects);
        Home1List = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.ghj,parent,false);

        Home1 currenthome = Home1List.get(position);

        TextView homename = view.findViewById(R.id.x7);
        ImageView Img = view.findViewById(R.id.im1);

        homename.setText(currenthome.getHomename());
        Img.setImageResource(currenthome.getHomephoto());


        return view;
    }
}
