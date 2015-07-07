package com.example.user.appofdoing.category;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.appofdoing.BaseFragment;
import com.example.user.appofdoing.R;

/**
 * Created by Dong on 2015-07-06.
 */
public class CategoryRootFragment extends BaseFragment {

    private FragmentManager fm;

    public static CategoryRootFragment newInstance() {
        CategoryRootFragment newFragment = new CategoryRootFragment();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_root_category, container, false);

        fm = getActivity().getSupportFragmentManager();

        ImageView clubIv = (ImageView) view.findViewById(R.id.imageView1);
        clubIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new CategoryClubFragment();
                fm.beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
            }
        });

        ImageView contestIv = (ImageView) view.findViewById(R.id.imageView2);
        contestIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new CategoryContestFragment();
                fm.beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
            }
        });

        return view;
    }
}
