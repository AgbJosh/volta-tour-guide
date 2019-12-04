package com.ithub.voltatourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a custom toolbar layout
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.tour_guide_pager);

        // Create an adapter that knows which fragment should be shown on each page
        TourGuideFragmentPageAdapter adapter = new TourGuideFragmentPageAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Attach the ViewPager to the TabLayout
        TabLayout tabLayout = findViewById(R.id.app_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
