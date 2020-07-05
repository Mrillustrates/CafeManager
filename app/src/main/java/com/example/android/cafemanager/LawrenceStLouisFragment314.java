package com.example.android.cafemanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LawrenceStLouisFragment314 extends Fragment{

    int dtmId = R.drawable.dtm_96;
    int cashierId = R.drawable.cashier50;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public LawrenceStLouisFragment314(){

    }

    public static LawrenceStLouisFragment314 newInstance(String param1, String param2) {
        LawrenceStLouisFragment314 fragment = new LawrenceStLouisFragment314();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View rootView = inflater.inflate(R.layout.interviews_list, container, false);



        ArrayList<Candidate> candidates = new ArrayList<Candidate>();

        candidates.add(new Candidate("Chris Lawrence", "4152313814", "Deliver Driver", "example@gmail.com", "Cafe 314" , dtmId));

        CandidateAdapter adapter = new CandidateAdapter(getActivity(), candidates);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


    return rootView;

    }
}

