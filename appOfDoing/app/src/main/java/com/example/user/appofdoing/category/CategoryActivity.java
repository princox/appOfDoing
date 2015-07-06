package com.example.user.appofdoing.category;

import android.support.v4.app.Fragment;

import com.example.user.appofdoing.SingleFragmentActivity;


public class CategoryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CategoryRootFragment();
    }
}
