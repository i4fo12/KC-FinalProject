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

public class UnAdapter extends ArrayAdapter<Un> {

    List<Un> UnList;

    public UnAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        UnList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.ghj,parent,false);

        Un currentUn = UnList.get(position);

        TextView Unname = view.findViewById(R.id.x7);

        Unname.setText(currentUn.getUnname());




        return view;
    }
}
