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

public class saveAdapter extends ArrayAdapter<save> {


    List<save> saveList;


    public saveAdapter(@NonNull Context context, int resource, @NonNull List<save> objects) {
        super(context, resource, objects);
    saveList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.ghj,parent,false);

        save currentsave = saveList.get(position);


        TextView savename = view.findViewById(R.id.x7);
        ImageView Imgsave = view.findViewById(R.id.im1);

        savename.setText(currentsave.getSavename());
        Imgsave.setImageResource(currentsave.getSavephoto());

        return view;
    }
}
