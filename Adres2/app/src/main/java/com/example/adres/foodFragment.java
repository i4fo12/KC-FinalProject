package com.example.adres;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class foodFragment extends Fragment {

    //Food    sa1 , sa2 ,sa3 , sa4 ,sa5 , sa6 , sa7 , sa8 , sa9 , sa10 , sa11 , sa12
    //index    0 ,  1   , 2  ,  3  ,  4 , 5   ,  6  ,  7 ,    8  , 9 , 10  , 11
      ArrayList<food1> foods =new ArrayList<>();


private TextView foodname;
private TextView fooddetls;
private ImageView foodphoto;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        ListView moha = view.findViewById(R.id.listview);
        setFoodname();

        moha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                food1 currentFood = foods.get(i);

                Intent in = new Intent(getActivity() , MainActivity2.class);
                in.putExtra("food",currentFood);
                startActivity(in);




            }
        });


        food1 sa1 = new food1("orange",R.drawable.or," It is useful in the treatment of heart disease, high blood pressure and atherosclerosis by eating one orange a day. - Prevents blood from freezing on the walls of blood vessels thanks to its neoflavonoid content.");
        food1 sa2 = new food1("Fatty fish",R.drawable.kl,"Omega-3 fats apparently play an essential role in cognitive and behavioral functions such as learning and memory processes.\n" +
                " Omega acids or fats have three other benefits for the brain. The first is that they can slow the process of age-related mental decline and help rule out Alzheimer's disease.\n" +
                " The second benefit appears when the body does not get enough omega-3 fats, which is associated with the inability to learn, and exposure to depression.\n" +
                " Symptoms of omega-3 deficiency in the body also include fatigue, poor memory, and mood disorders.\n" +
                " One study found that people who ate cooked or grilled fish on a regular basis had more gray matter in their brains.  Gray matter contains most of the neurons that control decision-making, memory, and emotion.");
        food1 sa3 = new food1("Dark Chocolate",R.drawable.cho,"Dark chocolate contains cocoa, which is rich in compounds that promote brain health;  Like flavonoid antioxidants, the brain is particularly vulnerable to damage from oxidative stress. Oxidative stress is one of the primary factors that increase the risk of brain-related diseases with age.");
        food1 sa4 = new food1("turmeric",R.drawable.krm,"Supporting memory Curcumin helps improve memory for people with Alzheimer’s disease, and it also helps in removing amyloid plaques from the brain, which is the main cause of Alzheimer’s disease, and this has been proven in some laboratory studies, [5] but there is still a need to do more  Scientific studies to prove its effect in humans.  relieves depression;  Curcumin boosts mood-enhancing neurotransmitters;  serotonin and dopamine.  Helps in the growth of new neurons;  Curcumin supports neurotrophic factors that help in the growth of brain cells.");
        food1 sa5 = new food1("coffee",R.drawable.coffee,"increased alertness and alertness;  Caffeine keeps the brain alert by blocking adenosine, a chemical neurotransmitter that causes sleepiness.  improve mood;  Caffeine boosts certain neurotransmitters that make you feel good and happy;  Ex: serotonin.  increased sharpness of focus;  The results of one study found that drinking a large amount of coffee in the morning, or small amounts during the day, makes people more effective in tasks that require focus.[4] The long-term association of drinking coffee with a reduced risk of neurological diseases;  Like Alzheimer's and Parkinson's.");
        food1 sa6 = new food1("Pumpkin seeds",R.drawable.kge,"zinc;  An important component of nerve transmission, zinc deficiency has been linked to many neurological conditions.  Including Alzheimer's disease, Parkinson's disease, and depression. \n" +
                "magnesium;  Low magnesium levels are associated with many neurological diseases;  such as migraines, epilepsy, and depression.  It is also a necessary component of learning and memory.\n" +
                "copper;  The brain uses copper to help control nerve signals, and when the level of copper becomes outside the normal range, the possibility of neurological disorders increases;  Ex: Alzheimer's disease\n" +
                "Iron;  Iron deficiency causes brain fog - a disorder that causes forgetfulness and loss of ability to focus - and impaired brain function.");
        food1 sa7 = new food1("nuts",R.drawable.nmm,"which contain many beneficial nutrients;  Like healthy fats, antioxidants, and vitamin E, nuts of all kinds are good for the brain, and walnuts have an added advantage.  It provides omega-3 fatty acids.  The results of one study suggest that women who ate nuts regularly over several years had better memory and greater cognitive abilities as they got older.");
        food1 sa8 = new food1("egg",R.drawable.egg,"It is a good source of many nutrients associated with brain health.  Such as: Vitamin B6 and B12, and folate, in addition to choline, which has a role in the manufacture of some neurotransmitters and enhance memory and mood.");
        food1 sa9 = new food1("Green tea",R.drawable.green,"Green tea contains caffeine that enhances brain function, alertness, memory, and focus.  It also includes L-theanine, an amino acid that can cross into the brain, and increases the activity of the neurotransmitter GABA, which helps reduce anxiety and make a person feel relaxed.  Green tea also contains polyphenols and antioxidants that protect the brain from deteriorating with age, and may prevent Alzheimer's and Parkinson's diseases.");
        food1 sa10 = new food1("broccoli",R.drawable.br,"Broccoli is a plant rich in glucosinolates, whose digestion produces compounds that reduce oxidative stress, thus reducing the risk of neurodegenerative diseases.  Such as Alzheimer's, in addition to containing vitamin C and flavonoids, both of which are anti-oxidants, and promote brain health.");
        food1 sa11 = new food1("Avocado",R.drawable.av,"Avocado is considered one of the important foods that promote brain health, as it is rich in antioxidants.");
        food1 sa12 = new food1("Beets",R.drawable.bs,"Beets are one of the foods that have amazing benefits in improving memory and preventing its loss with age, and including beets in the diet on a daily basis enhances the ability to focus.");

        foods.add(sa1);
        foods.add(sa2);
        foods.add(sa3);
        foods.add(sa4);
        foods.add(sa5);
        foods.add(sa6);
        foods.add(sa7);
        foods.add(sa8);
        foods.add(sa9);
        foods.add(sa10);
        foods.add(sa11);
        foods.add(sa12);

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity() , 0 , foods);

        moha.setAdapter(arrayAdapter);




        return view;

    }

    public void setFoodname(){

             // String foodname , int foodphoto , fooddetle

    }




}
