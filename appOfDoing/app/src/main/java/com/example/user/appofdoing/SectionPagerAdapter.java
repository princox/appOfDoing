package com.example.user.appofdoing;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Dong on 2015-07-07.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<BaseFragment> mFragments;

    public SectionPagerAdapter(FragmentManager fm, ArrayList<BaseFragment> fragments){
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
