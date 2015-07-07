package com.example.user.appofdoing.category;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.appofdoing.BaseFragment;
import com.example.user.appofdoing.R;

/**
 * Created by Dong on 2015-07-06.
 */
public class CategoryClubFragment extends BaseFragment {

    private ImageView programmingIV, service_planningIV, sportIV, voluntary_serviceIV, travelIV, foodstoreIV;

    boolean selected[];

    public static CategoryClubFragment newInstance(){
        CategoryClubFragment newFragment = new CategoryClubFragment();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_club_category,container,false);


        selected = new boolean[6];

        for(int i=0; i<selected.length; i++){
            selected[i] = false;
        }

        programmingIV = (ImageView) view.findViewById(R.id.programming);
        programmingIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected[0]) {
                    Log.i("category Btn", "if");
                    programmingIV.setImageResource(R.drawable.programming);
                    selected[0] = false;
                }else{
                    Log.i("category Btn", "else");
                    programmingIV.setImageResource(R.drawable.programming2);
                    selected[0] = true;
                }
            }
        });

        service_planningIV = (ImageView) view.findViewById(R.id.service_planning);
        service_planningIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected[1]) {
                    service_planningIV.setImageResource(R.drawable.service_planning);
                    selected[1] = false;
                }else{
                    service_planningIV.setImageResource(R.drawable.service_planning2);
                    selected[1] = true;
                }
            }
        });

        sportIV = (ImageView) view.findViewById(R.id.sport);
        sportIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected[2]) {
                    sportIV.setImageResource(R.drawable.sport);
                    selected[2] = false;
                }else{
                    sportIV.setImageResource(R.drawable.sport2);
                    selected[2] = true;
                }
            }
        });

        voluntary_serviceIV = (ImageView) view.findViewById(R.id.voluntary_service);
        voluntary_serviceIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected[3]) {
                    voluntary_serviceIV.setImageResource(R.drawable.voluntary_service);
                    selected[3] = false;
                }else{
                    voluntary_serviceIV.setImageResource(R.drawable.voluntary_service2);
                    selected[3] = true;
                }
            }
        });

        travelIV = (ImageView) view.findViewById(R.id.travel);
        travelIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected[4]) {
                    travelIV.setImageResource(R.drawable.travel);
                    selected[4] = false;
                }else{
                    travelIV.setImageResource(R.drawable.travel2);
                    selected[4] = true;
                }
            }
        });

        foodstoreIV = (ImageView) view.findViewById(R.id.foodstore);
        foodstoreIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected[5]) {
                    foodstoreIV.setImageResource(R.drawable.foodstore);
                    selected[5] = true;
                }else{
                    foodstoreIV.setImageResource(R.drawable.foodstore2);
                    selected[5] = true;
                }
            }
        });

        return view;
    }
}
