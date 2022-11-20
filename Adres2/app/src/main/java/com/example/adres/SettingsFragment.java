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


public class SettingsFragment extends Fragment {

    ArrayList<Un> Uns =new ArrayList<>();

    private TextView unname;
    private TextView undetls;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        ListView moha2 = view.findViewById(R.id.listview2);

        moha2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Un currentUn = Uns.get(i);

                Intent in = new Intent(getActivity() , MainActivity4.class);
                in.putExtra("Un",currentUn);
                startActivity(in);




            }
        });

        Un d1 = new Un("Use prior knowledge/preview","When students preview the text, they click on what they already know which will help them understand the text they are about to read and this provides a framework for any new information they read.");
        Un d2 = new Un("forecasting","When students make predictions about the text they are about to read, it makes predictions based on their previous knowledge on similar topics.  As they read, they may mentally revise their predictions as they get more information.\n");
        Un d3 = new Un("Define the main idea and summarize","Defining the main idea and summarizing requires students to identify what is important and then put it into their own words. Implicitly trying in the process to understand the author's purpose in writing the text.");
        Un d4 = new Un("Interrogation","Asking and answering questions about the text is another strategy that helps students focus on the meaning of the text. Teachers can help by providing a template for both the process of asking good questions and strategies for finding answers in the text.");
        Un d5 = new Un("Making Inferences","In order to make conclusions about something that is not explicitly stated in the text, students must learn to rely on previous knowledge and recognize clues in the text itself.");
        Un d6 = new Un("Visualization","Studies have shown that students who fantasize while reading remember better than those who don't. Readers can take advantage of illustrations embedded in the text or create their own images or mind drawings when reading text without illustrations.");
        Un d7 = new Un("Expectation","Teachers can ask readers to make a prediction about a story based on the title and any other available evidence, such as illustrations. Teachers can later ask students to find text that supports or contradicts their expectations.");

        Uns.add(d1);
        Uns.add(d2);
        Uns.add(d3);
        Uns.add(d4);
        Uns.add(d5);
        Uns.add(d6);
        Uns.add(d7);

        UnAdapter arrayAdapter = new UnAdapter(getActivity() , 0 , Uns);

        moha2.setAdapter(arrayAdapter);


        return view;
    }
}