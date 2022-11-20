package com.example.adres;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.adres.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        replaceFragment(new HomeFragment());




        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNav.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){


                case R.id.nav_home:
                    replaceFragment(new HomeFragment());
                    break;

                case R.id.nav_person:
                    replaceFragment(new ProfaileFragment());
                    break;

                case R.id.nav_un:
                    replaceFragment(new SettingsFragment());
                    break;

                case R.id.nav_food:
                    replaceFragment(new foodFragment());
                    break;

                case R.id.nav_act:
                    replaceFragment(new actFragment());
                    break;

            }

            return true;
        });

    }
    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.body,fragment);
        fragmentTransaction.commit();
    }
}