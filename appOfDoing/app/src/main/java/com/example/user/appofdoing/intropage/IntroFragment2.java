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
public class IntroFragment2 extends Fragment {

    public static IntroFragment2 newInstance(){
        IntroFragment2 newFragment = new IntroFragment2();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intropage2,container,false);

        return view;
    }
}