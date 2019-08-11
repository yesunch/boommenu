package com.nightonke.boommenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class EaseActivityWithFragment extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ease_fragment);
        if (savedInstanceState == null) {
            EaseFragment easeFragment=new EaseFragment();
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.frameLayout, easeFragment)
//                    //.addToBackStack("fname")
//                    .commit();
            getFragmentManager().beginTransaction().add(R.id.frameLayout, easeFragment).commit();
        }


    }
}
