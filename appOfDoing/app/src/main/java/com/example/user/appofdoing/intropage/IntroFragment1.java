package com.example.user.appofdoing.intropage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.appofdoing.R;

/**
 * Created by Dong on 2015-07-06.
 */
public class IntroFragment1 extends Fragment{

    public static IntroFragment1 newInstance(){
        IntroFragment1 newFragment = new IntroFragment1();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intropage1,container,false);

        return view;
    }
}
