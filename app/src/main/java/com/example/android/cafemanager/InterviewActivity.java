package com.example.android.cafemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class InterviewActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interviews_list);


        ArrayList<Candidate> candidates = new ArrayList<Candidate>();

        candidates.add(new Candidate("Chris Lawrence", "4152313814", "Deliver Driver", "example@gmail.com", "Cafe 1281" ));

        CandidateAdapter adapter = new CandidateAdapter(this, candidates);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
}
    }
