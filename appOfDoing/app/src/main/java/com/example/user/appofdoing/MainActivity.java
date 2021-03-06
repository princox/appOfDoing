package com.example.user.appofdoing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.user.appofdoing.category.CategoryActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private SectionPagerAdapter mSectionPagerAdapter;
    private ViewPager mViewPager;
    private ArrayList<BaseFragment> mFragments;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
        startActivity(intent);

        initialFragment();
        mSectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager(), mFragments);

        mViewPager = (ViewPager)findViewById(R.id.viewPager);
        mViewPager.setAdapter(mSectionPagerAdapter);
    }

    private void initialFragment(){
        mFragments = new ArrayList<BaseFragment>();

        mFragments.add(MainListFragment.newInstance());
        mFragments.add(MainListFragment.newInstance());
        mFragments.add(MainListFragment.newInstance());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
