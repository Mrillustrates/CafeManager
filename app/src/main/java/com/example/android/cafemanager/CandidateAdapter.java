package com.example.android.cafemanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CandidateAdapter extends ArrayAdapter<Candidate> {

    public CandidateAdapter(Context context, ArrayList<Candidate> candidates) {
        super(context, 0, candidates);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Retrieves the current candidate at this current position on the list
        Candidate currentCandidate = getItem(position);

        //Locate current candidate based on the position and display Candidate's name
        TextView candidateNameTextView = (TextView) listItemView.findViewById(R.id.candidate_name_text_view);
        candidateNameTextView.setText(currentCandidate.getCandidateName());


        //Locate current candidate based on the position and display Candidate's phone number
        TextView candidatePhoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        candidatePhoneNumberTextView.setText(currentCandidate.getPhoneNumber());

        TextView candidateJobPositionTextView = (TextView) listItemView.findViewById(R.id.candidate_position_text_view);
        candidateJobPositionTextView.setText(currentCandidate.getPosition());

        TextView candidateEmailTextView = (TextView) listItemView.findViewById(R.id.candidate_email_text_view);
        candidateEmailTextView .setText(currentCandidate.getEmail());


        return listItemView;
    }
}
