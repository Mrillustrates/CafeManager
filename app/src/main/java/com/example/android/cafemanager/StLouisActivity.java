package com.example.android.cafemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StLouisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.st_louis_aop_list);



        //TODO : set up intent and on CLick based on buttons selected for St. Louis AOP
        TextView lawrenceAOP = (TextView) findViewById(R.id.st_louis_region_1_aop);

        lawrenceAOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lawrenceIntent = new Intent(StLouisActivity.this, LawrenceStLouisLandingPage.class);
                startActivity(lawrenceIntent);
            }
        });
    }
}