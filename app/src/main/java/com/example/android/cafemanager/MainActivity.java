package com.example.android.cafemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find View that shows Candidates to be interviews
        TextView candidates = (TextView) findViewById(R.id.interviews);

        //Find View that shows Statuses of candidates interviews
        TextView statuses = (TextView) findViewById(R.id.status);

        //Setup an onclick Listener for the view
        candidates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent interviewsIntent = new Intent(MainActivity.this, InterviewActivity.class);
                startActivity(interviewsIntent);
            }
        });

        statuses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statusIntent = new Intent(MainActivity.this, StatusActivity.class);
                startActivity(statusIntent);
            }
        });
    }


}
