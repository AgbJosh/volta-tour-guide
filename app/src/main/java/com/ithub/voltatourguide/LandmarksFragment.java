package com.ithub.voltatourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Create ArrayList objects of type ContentInfo and populate it with data on Landmarks in your city
        ArrayList<ContentInfo> contentInfo = new ArrayList<>();
        contentInfo.add(new ContentInfo(R.drawable.lake_volta, getString(R.string.lake_volta), getString(R.string.lake_volta_description)));
        contentInfo.add(new ContentInfo(R.drawable.akosombo, getString(R.string.akosombo_dam),getString(R.string.akosombo_description)));

        // Inflate and assign a variable to the root view
        View rootViewGroup = inflater.inflate(R.layout.fragment_container, container, false);

        // Find RecyclerView in fragment, create a new LayoutManager and set it to the ContentInfoAdapter
        RecyclerView recyclerView = rootViewGroup.findViewById(R.id.fragment_content);
        LinearLayoutManager attractionsLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.Adapter adapter = new ContentInfoAdapter(contentInfo);
        recyclerView.setLayoutManager(attractionsLayoutManager);
        recyclerView.setAdapter(adapter);

        // Return the inflated the layout for this fragment
        return rootViewGroup;
    }

}
