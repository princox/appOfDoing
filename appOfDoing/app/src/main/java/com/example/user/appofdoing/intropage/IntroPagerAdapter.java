package com.example.user.appofdoing.intropage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Dong on 2015-07-06.
 */
public class IntroPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    public IntroPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
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
