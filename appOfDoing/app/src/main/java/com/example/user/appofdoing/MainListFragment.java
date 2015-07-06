package com.example.user.appofdoing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Dong on 2015-07-07.
 */
public class MainListFragment extends BaseFragment {

    ListView listView;
    MainListAdapter mMainListAdapter;
    ArrayList<Content> contents;

    public static MainListFragment newInstance() {
        MainListFragment newFragment = new MainListFragment();

        return newFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        listView = (ListView) view.findViewById(R.id.listView);
        contents = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            contents.add(new Content(R.drawable.meteor));
        }

        mMainListAdapter = new MainListAdapter();

        listView.setAdapter(mMainListAdapter);

        return view;
    }

    class MainListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return contents.size();
        }

        @Override
        public Object getItem(int position) {
            return contents.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = LayoutInflater.from(getActivity());
                view = inflater.inflate(R.layout.list_item, parent, false);
            }

            return view;
        }
    }
}
