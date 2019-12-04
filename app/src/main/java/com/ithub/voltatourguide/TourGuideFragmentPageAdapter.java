package com.ithub.voltatourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TourGuideFragmentPageAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public TourGuideFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        // Get the position of the current item and return the associated fragment
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2){
            return new LandmarksFragment();
        } else {
            return new FestivalsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        // Get the position of the current fragment and display it's associated Page Title
        if (position == 0) {
            return mContext.getResources().getText(R.string.attractions_tab);
        } else if (position == 1){
            return mContext.getResources().getText(R.string.hotels_tab);
        } else if (position == 2){
            return mContext.getResources().getText(R.string.landmarks_tab);
        } else {
            return mContext.getResources().getText(R.string.festivals_tab);
        }
    }
}
