package com.example.android.cafemanager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class LawrenceStLouisLandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lawrence_main_landingpage);


        //TODO: Implement ViewPager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        LawrenceCategoryAdapter adapter = new LawrenceCategoryAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);

        //TabLayout for the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}