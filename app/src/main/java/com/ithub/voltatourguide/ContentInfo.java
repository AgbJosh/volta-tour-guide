package com.ithub.voltatourguide;

public class ContentInfo {
    // Create variables for imageResource, nameOfPlace and placeDescription
    private int mImageResource;
    private String mNameOfPlace;
    private String mPlaceDescription;

    // Public constructor accepts 3 parameters and creates a ContentInfo object
    public ContentInfo(int imageResource, String nameOfPlace, String placeDescription){
        mImageResource = imageResource;
        mNameOfPlace = nameOfPlace;
        mPlaceDescription = placeDescription;
    }

    // Create getter methods to access private fields
    public String getmNameOfPlace() {
        return mNameOfPlace;
    }

    public String getmPlaceDescription() {
        return mPlaceDescription;
    }

    public int getmImageResource() {
        return mImageResource;
    }
}
