package com.example.adres;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;



public class HomeFragment extends Fragment {


    ArrayList<Home1> homes = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ListView sac = view.findViewById(R.id.sac);


        sac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Home1 currenthome = homes.get(i);

                Intent in = new Intent(getActivity() , MainActivity6.class);
                in.putExtra("home",currenthome);
                startActivity(in);




            }
        });


        Home1 m28 = new Home1("orange",R.drawable.or," It is useful in the treatment of heart disease, high blood pressure and atherosclerosis by eating one orange a day. - Prevents blood from freezing on the walls of blood vessels thanks to its neoflavonoid content.");
        Home1 m27 = new Home1("Fatty fish",R.drawable.kl,"Omega-3 fats apparently play an essential role in cognitive and behavioral functions such as learning and memory processes.\n" +
                " Omega acids or fats have three other benefits for the brain. The first is that they can slow the process of age-related mental decline and help rule out Alzheimer's disease.\n" +
                " The second benefit appears when the body does not get enough omega-3 fats, which is associated with the inability to learn, and exposure to depression.\n" +
                " Symptoms of omega-3 deficiency in the body also include fatigue, poor memory, and mood disorders.\n" +
                " One study found that people who ate cooked or grilled fish on a regular basis had more gray matter in their brains.  Gray matter contains most of the neurons that control decision-making, memory, and emotion.");
        Home1 m26 = new Home1("Dark Chocolate",R.drawable.cho,"Dark chocolate contains cocoa, which is rich in compounds that promote brain health;  Like flavonoid antioxidants, the brain is particularly vulnerable to damage from oxidative stress. Oxidative stress is one of the primary factors that increase the risk of brain-related diseases with age.");
        Home1 m25 = new Home1("turmeric",R.drawable.krm,"Supporting memory Curcumin helps improve memory for people with Alzheimer’s disease, and it also helps in removing amyloid plaques from the brain, which is the main cause of Alzheimer’s disease, and this has been proven in some laboratory studies, [5] but there is still a need to do more  Scientific studies to prove its effect in humans.  relieves depression;  Curcumin boosts mood-enhancing neurotransmitters;  serotonin and dopamine.  Helps in the growth of new neurons;  Curcumin supports neurotrophic factors that help in the growth of brain cells.");
        Home1 m24 = new Home1("coffee",R.drawable.coffee,"increased alertness and alertness;  Caffeine keeps the brain alert by blocking adenosine, a chemical neurotransmitter that causes sleepiness.  improve mood;  Caffeine boosts certain neurotransmitters that make you feel good and happy;  Ex: serotonin.  increased sharpness of focus;  The results of one study found that drinking a large amount of coffee in the morning, or small amounts during the day, makes people more effective in tasks that require focus.[4] The long-term association of drinking coffee with a reduced risk of neurological diseases;  Like Alzheimer's and Parkinson's.");
        Home1 m23 = new Home1("Pumpkin seeds",R.drawable.kge,"zinc;  An important component of nerve transmission, zinc deficiency has been linked to many neurological conditions.  Including Alzheimer's disease, Parkinson's disease, and depression. \n" +
                "magnesium;  Low magnesium levels are associated with many neurological diseases;  such as migraines, epilepsy, and depression.  It is also a necessary component of learning and memory.\n" +
                "copper;  The brain uses copper to help control nerve signals, and when the level of copper becomes outside the normal range, the possibility of neurological disorders increases;  Ex: Alzheimer's disease\n" +
                "Iron;  Iron deficiency causes brain fog - a disorder that causes forgetfulness and loss of ability to focus - and impaired brain function.");
        Home1 m22 = new Home1("nuts",R.drawable.nmm,"which contain many beneficial nutrients;  Like healthy fats, antioxidants, and vitamin E, nuts of all kinds are good for the brain, and walnuts have an added advantage.  It provides omega-3 fatty acids.  The results of one study suggest that women who ate nuts regularly over several years had better memory and greater cognitive abilities as they got older.");
        Home1 m21 = new Home1("egg",R.drawable.egg,"It is a good source of many nutrients associated with brain health.  Such as: Vitamin B6 and B12, and folate, in addition to choline, which has a role in the manufacture of some neurotransmitters and enhance memory and mood.");
        Home1 m20 = new Home1("Green tea",R.drawable.green,"Green tea contains caffeine that enhances brain function, alertness, memory, and focus.  It also includes L-theanine, an amino acid that can cross into the brain, and increases the activity of the neurotransmitter GABA, which helps reduce anxiety and make a person feel relaxed.  Green tea also contains polyphenols and antioxidants that protect the brain from deteriorating with age, and may prevent Alzheimer's and Parkinson's diseases.");
        Home1 m19 = new Home1("broccoli",R.drawable.br,"Broccoli is a plant rich in glucosinolates, whose digestion produces compounds that reduce oxidative stress, thus reducing the risk of neurodegenerative diseases.  Such as Alzheimer's, in addition to containing vitamin C and flavonoids, both of which are anti-oxidants, and promote brain health.");
        Home1 m18 = new Home1("Avocado",R.drawable.av,"Avocado is considered one of the important foods that promote brain health, as it is rich in antioxidants.");
        Home1 m17 = new Home1("Beets",R.drawable.bs,"Beets are one of the foods that have amazing benefits in improving memory and preventing its loss with age, and including beets in the diet on a daily basis enhances the ability to focus.");
        Home1 m16 = new Home1("playstation ",R.drawable.play,"Weekend Activities");
        Home1 m15 = new Home1("sport",R.drawable.sport,"Weekend Activities");
        Home1 m14 = new Home1("Information organization",R.drawable.sq,"Organizing information is one of the best ways to memorize, helps to improve memory and ease of retrieving information at any time, so the student must structure and organize the materials he studies");
        Home1 m13 = new Home1("Writing",R.drawable.er,"Repetition of writing helps you to memorize what you write, no matter how long it is");
        Home1 m12 = new Home1("Reading",R.drawable.re,"Reading is not as good as writing, but it is one of the easiest ways to memorize short material");
        Home1 m11 = new Home1("music",R.drawable.music,"Information can be studied by composing it, and converting it into a musical clip, as studies have confirmed that this method helps to remember information faster and easier.");
        Home1 m10 = new Home1("sleep",R.drawable.sleep,"Sleep for enough hours, as studies and research have confirmed that sleep has an effective role in improving and revitalizing memory, and thus helps to memorize faster.");
        Home1 m9 = new Home1("confidence",R.drawable.confidence,"Better self-confidence, as studies have confirmed that people with low self-confidence fail to memorize.");
        Home1 m8 = new Home1("Animation",R.drawable.animation,"Converting information into images, for example, it can be converted into graphs or different graphics, as this method helps to save the information and not forget it.");
        Home1 m7 = new Home1("Use prior knowledge/preview",R.drawable.gg,"When students preview the text, they click on what they already know which will help them understand the text they are about to read and this provides a framework for any new information they read.");
        Home1 m6 = new Home1("forecasting",R.drawable.gg,"When students make predictions about the text they are about to read, it makes predictions based on their previous knowledge on similar topics.  As they read, they may mentally revise their predictions as they get more information.\n");
        Home1 m5 = new Home1("Define the main idea and summarize",R.drawable.gg,"Defining the main idea and summarizing requires students to identify what is important and then put it into their own words. Implicitly trying in the process to understand the author's purpose in writing the text.");
        Home1 m4 = new Home1("Interrogation",R.drawable.gg,"Asking and answering questions about the text is another strategy that helps students focus on the meaning of the text. Teachers can help by providing a template for both the process of asking good questions and strategies for finding answers in the text.");
        Home1 m3 = new Home1("Making Inferences",R.drawable.gg,"In order to make conclusions about something that is not explicitly stated in the text, students must learn to rely on previous knowledge and recognize clues in the text itself.");
        Home1 m2 = new Home1("Visualization",R.drawable.gg,"Studies have shown that students who fantasize while reading remember better than those who don't. Readers can take advantage of illustrations embedded in the text or create their own images or mind drawings when reading text without illustrations.");
        Home1 m1 = new Home1("Expectation",R.drawable.gg,"Teachers can ask readers to make a prediction about a story based on the title and any other available evidence, such as illustrations. Teachers can later ask students to find text that supports or contradicts their expectations.");


        homes.add(m1);
        homes.add(m2);
        homes.add(m3);
        homes.add(m4);
        homes.add(m5);
        homes.add(m6);
        homes.add(m7);
        homes.add(m8);
        homes.add(m9);
        homes.add(m10);
        homes.add(m11);
        homes.add(m12);
        homes.add(m13);
        homes.add(m14);
        homes.add(m15);
        homes.add(m16);
        homes.add(m17);
        homes.add(m18);
        homes.add(m19);
        homes.add(m20);
        homes.add(m21);
        homes.add(m22);
        homes.add(m23);
        homes.add(m24);
        homes.add(m25);
        homes.add(m26);
        homes.add(m27);
        homes.add(m28);

        homeAdapter arrayAdapter = new homeAdapter(getActivity() , 0 , homes);

        sac.setAdapter(arrayAdapter);




        return view;
    }
}