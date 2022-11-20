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

public class ActAdapter extends ArrayAdapter<act> {

    List<act> actList;

    public ActAdapter(@NonNull Context context, int resource, @NonNull List<act> objects) {
        super(context, resource, objects);
        actList = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.ghj,parent,false);

        act currentact = actList.get(position);


        TextView actname = view.findViewById(R.id.x7);
        ImageView Imgact = view.findViewById(R.id.im1);

        actname.setText(currentact.getActname());
        Imgact.setImageResource(currentact.getActphoto());

        return view;
    }
}
