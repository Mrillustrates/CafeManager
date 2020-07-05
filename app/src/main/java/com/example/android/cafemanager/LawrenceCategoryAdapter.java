package com.example.android.cafemanager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LawrenceCategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //Constructor for the adapter
    public LawrenceCategoryAdapter(FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }

    //Here is where you input how many categories there will be
    @Override
    public int getCount(){
        return 2;
    }

    //Here is where you explicitly state which fragment shows up at the given position
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LawrenceStLouisFragment314();
            case 1:
                return new LawrenceStLouisFragment636();
            default:
                return null;
        }
    }

    //Define the labels at each position
        @Override
                public CharSequence getPageTitle(int position){
                    if(position == 0){
                        return mContext.getString(R.string.Cafe314);
                    }
                    else if(position ==1){
                        return mContext.getString(R.string.Cafe636);
                    }
                    else {
                        return mContext.getString(R.string.Cafe314);
                    }
    }
}