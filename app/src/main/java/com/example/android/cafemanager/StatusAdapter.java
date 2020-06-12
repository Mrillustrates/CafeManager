package com.example.android.cafemanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StatusAdapter extends ArrayAdapter<Status> {

    public StatusAdapter(Context context, ArrayList<Status> statuses) {
        super(context, 0, statuses);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.checkbox_list,  parent, false);
        }

        final Status currentStatus = getItem(position);


        //Locates candidate name textview and sets Text based on current position
        TextView currentCandidateStatusView = (TextView) listItemView.findViewById(R.id.candidate_name_status);
        currentCandidateStatusView.setText(currentStatus.getCandidateName());

        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.position_picture);

        if(currentStatus.hasImage()){
            defaultImageView.setImageResource(currentStatus.getnImageResourceId());

            //Make image visible if there is one
            defaultImageView.setVisibility(View.VISIBLE);
        }
        else {
            //Hide the image if it is meant to be hidden
            defaultImageView.setVisibility(View.GONE);
        }

       final CheckBox candidateHiredCheckbox = (CheckBox) listItemView.findViewById(R.id.checkbox_hired);
       if(currentStatus.isSelected()){

           candidateHiredCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(candidateHiredCheckbox.isChecked()){
                      Toast.makeText(getContext(), "Hired", Toast.LENGTH_SHORT).show();
                      currentStatus.setSelected(true);

                  }
               }
           });


       }
        return listItemView;

    }
}