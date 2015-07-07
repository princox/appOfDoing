package com.example.user.appofdoing.detailpage;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.user.appofdoing.R;

import java.util.ArrayList;


public class DetailPagerActivity extends AppCompatActivity {

    private DetailPagerAdapter mDetailPagerAdapter;
    private ViewPager mViewPager;
    private ArrayList<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        initialFragment();
        mDetailPagerAdapter = new DetailPagerAdapter(getSupportFragmentManager(),mFragments);

        mViewPager = (ViewPager)findViewById(R.id.viewPager);
        mViewPager.setAdapter(mDetailPagerAdapter);


    }

    private void initialFragment(){
        mFragments = new ArrayList<Fragment>();
        mFragments.add(DetailPageFragment.newInstance());
        mFragments.add(DetailPageFragment.newInstance());
        mFragments.add(DetailPageFragment.newInstance());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
