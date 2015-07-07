package com.example.user.appofdoing.detailpage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.appofdoing.R;

/**
 * Created by Dong on 2015-07-07.
 */
public class DetailPageFragment extends Fragment {

    public static DetailPageFragment newInstance() {
        DetailPageFragment newFragment = new DetailPageFragment();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail_page, container, false);




        return view;
    }
}
