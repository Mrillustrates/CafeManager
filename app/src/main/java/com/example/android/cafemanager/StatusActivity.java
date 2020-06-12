package com.example.android.cafemanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StatusActivity extends AppCompatActivity {


    int resourceId;
    Status status;
    ArrayList<Status> statusInterviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interviews_list);


        ArrayList<Status> statusInterviews = new ArrayList<Status>();
        statusInterviews.add(new Status("Christian Lawrence", false, "DTM", R.drawable.dtm_96));
        statusInterviews.add(new Status("Selma Hayek", false, "CASHIER", R.drawable.cashier50));



    StatusAdapter adapter = new StatusAdapter(this, statusInterviews);







        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);




    }




}


