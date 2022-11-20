package com.example.adres;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class actFragment extends Fragment {
    ArrayList<act> acts =new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view = inflater.inflate(R.layout.fragment_act, container, false);
        ListView Moha5 = view.findViewById(R.id.listc);

        Moha5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                act currentact = acts.get(i);

                Intent in = new Intent(getActivity() , MainActivity5.class);
                in.putExtra("act",currentact);
                startActivity(in);
            }
        });


        act c1 = new act("playstation ",R.drawable.play,"Weekend Activities");
        act c2 = new act("sport",R.drawable.sport,"Weekend Activities");

        acts.add(c1);
        acts.add(c2);

        ActAdapter arrayAdapter = new ActAdapter(getActivity() , 0 , acts);

        Moha5.setAdapter(arrayAdapter);





        return view;
    }
}