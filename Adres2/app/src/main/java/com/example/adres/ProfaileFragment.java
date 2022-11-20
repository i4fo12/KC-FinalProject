package com.example.adres;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class ProfaileFragment extends Fragment {

    ArrayList<save> saves =new ArrayList<>();

    private TextView savename;
    private TextView savedetls;
    private ImageView savephoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profaile, container, false);
        ListView moha1 = view.findViewById(R.id.listview1);




        save s1 = new save("Information organization",R.drawable.sq,"Organizing information is one of the best ways to memorize, helps to improve memory and ease of retrieving information at any time, so the student must structure and organize the materials he studies");
        save s2 = new save("Writing",R.drawable.er,"Repetition of writing helps you to memorize what you write, no matter how long it is");
        save s3 = new save("Reading",R.drawable.re,"Reading is not as good as writing, but it is one of the easiest ways to memorize short material");
        save s4 = new save("music",R.drawable.music,"Information can be studied by composing it, and converting it into a musical clip, as studies have confirmed that this method helps to remember information faster and easier.");
        save s5 = new save("sleep",R.drawable.sleep,"Sleep for enough hours, as studies and research have confirmed that sleep has an effective role in improving and revitalizing memory, and thus helps to memorize faster.");
        save s6 = new save("confidence",R.drawable.confidence,"Better self-confidence, as studies have confirmed that people with low self-confidence fail to memorize.");
        save s7 = new save("Animation",R.drawable.animation,"Converting information into images, for example, it can be converted into graphs or different graphics, as this method helps to save the information and not forget it.");

        saves.add(s1);
        saves.add(s2);
        saves.add(s3);
        saves.add(s4);
        saves.add(s5);
        saves.add(s6);
        saves.add(s7);

        moha1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                save currentsave = saves.get(i);

                Intent oi = new Intent(getActivity() , MainActivity3.class);
                oi.putExtra("save",currentsave);
                startActivity(oi);


            }
        });

        saveAdapter Adapter = new saveAdapter(getActivity() , 0 , saves);

        moha1.setAdapter(Adapter);

        return view;
    }
}