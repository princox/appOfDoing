package com.example.user.appofdoing.detailpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Dong on 2015-07-07.
 */
public class DetailPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    public DetailPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
