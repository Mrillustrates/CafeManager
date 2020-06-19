package com.example.android.cafemanager;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
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
    int dtmId = R.drawable.dtm_96;
    int cashierId = R.drawable.cashier50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interviews_list);


        //Create an ArrayList using the Status class to create new candidates to provide statuses for

        ArrayList<Status> statusInterviews = new ArrayList<Status>();
        statusInterviews.add(new Status("Christian Lawrence", false, "DTM", dtmId));
        statusInterviews.add(new Status("Selma Hayek", false, "CASHIER", cashierId));




    StatusAdapter adapter = new StatusAdapter(this, statusInterviews);







        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);




    }


    }







