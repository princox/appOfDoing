package com.example.user.appofdoing.intropage;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.appofdoing.LoginActivity;
import com.example.user.appofdoing.R;

/**
 * Created by Dong on 2015-07-06.
 */
public class IntroFragment3 extends Fragment {

    public static IntroFragment3 newInstance(){
        IntroFragment3 newFragment = new IntroFragment3();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intropage3,container,false);

        ImageView arrowBtn = (ImageView)view.findViewById(R.id.arrow);
        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }
}