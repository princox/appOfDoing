package com.example.user.appofdoing.intropage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.user.appofdoing.R;

import java.util.ArrayList;

/**
 * Created by Dong on 2015-07-06.
 */
public class IntroActivity extends AppCompatActivity {

    private IntroPagerAdapter mIntroPagerAdapter;
    private ViewPager mViewPager;
    private ArrayList<Fragment> mFragments;


    @Override
    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initialFragment();
        mIntroPagerAdapter = new IntroPagerAdapter(getSupportFragmentManager(),mFragments);

        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(mIntroPagerAdapter);




    }

    private void initialFragment(){
        mFragments = new ArrayList<Fragment>();
        mFragments.add(IntroFragment1.newInstance());
        mFragments.add(IntroFragment2.newInstance());
        mFragments.add(IntroFragment3.newInstance());
    }
}
