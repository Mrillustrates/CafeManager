package com.example.android.cafemanager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

public class LawrenceStLouisFragment636 extends Fragment {


    //id for image resources for brevity
    int dtmId = R.drawable.dtm_96;
    int cashierId = R.drawable.cashier50;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    //empty constructor for fragment

    public LawrenceStLouisFragment636(){

    }

    // Fragment takes in two params
    public static LawrenceStLouisFragment636 newInstance(String param1, String param2) {
        LawrenceStLouisFragment636 fragment = new LawrenceStLouisFragment636();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //Create a View to be inflated with interview_list
        View rootView = inflater.inflate(R.layout.interviews_list, container, false);


        //New Candidate Arraylist
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();

        //Job candidates with their contact details and accompanying image resource Id
        candidates.add(new Candidate("Tisha Campbell", "6364218382", "Deliver Driver", "example@gmail.com", "Cafe 636", dtmId));
        candidates.add(new Candidate("Marge Simpson", "6362398890", "Cashier", "margie@icloud.com", "Cafe 636", cashierId));

        CandidateAdapter adapter = new CandidateAdapter(getActivity(), candidates);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;

    }
}



