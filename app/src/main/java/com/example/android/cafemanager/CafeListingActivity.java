package com.example.android.cafemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CafeListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_list_main);


        //TODO: Create an onclick Listener to take user to Hiring Manager Page
        //Find view with id for St. Louis textbutton
        Button aopTextView = (Button) findViewById(R.id.st_louis_cafes);


        //Setup an OnClickListener to s3end them to the St Louis AOP Page
        aopTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stLouisIntent = new Intent(CafeListingActivity.this, StLouisActivity.class);
                startActivity(stLouisIntent);
            }
        });



        //TODO: Implement fragments to allow for tabbing of cafes once manager selects their name
    }
}