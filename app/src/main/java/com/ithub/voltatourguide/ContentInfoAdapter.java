package com.ithub.voltatourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContentInfoAdapter extends RecyclerView.Adapter<ContentInfoAdapter.ContentInfoViewHolder> {
    private ArrayList<ContentInfo> mContentInfoList;

    // Constructor to create a new ContentInfoAdapter object that accepts ContentInfo ArrayList as parameter
    public ContentInfoAdapter(ArrayList<ContentInfo> mContentInfoList) {
        this.mContentInfoList = mContentInfoList;
    }

    @NonNull
    @Override
    public ContentInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Inflate content_list.xml and assign it to the variable contentView
        View contentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_list, parent, false);
        return new ContentInfoViewHolder(contentView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentInfoViewHolder holder, int position) {

        // Get the ContentInfo object located at this position in the list
        ContentInfo currentContentInfo = mContentInfoList.get(position);

        // Populate the views in content_list layout with the data from ContentInfo
        holder.mImage.setImageResource(currentContentInfo.getmImageResource());
        holder.mNameOfPlace.setText(currentContentInfo.getmNameOfPlace());
        holder.mPlaceDescription.setText(currentContentInfo.getmPlaceDescription());
    }

    @Override
    public int getItemCount() {
        return mContentInfoList.size();
    }

    public class ContentInfoViewHolder extends RecyclerView.ViewHolder{

        // Create variables for the views in content_list.xml
        public ImageView mImage;
        public TextView mNameOfPlace;
        public TextView mPlaceDescription;

        public ContentInfoViewHolder(@NonNull View itemView) {
            super(itemView);

            // Find the id of the views and assign them to the variables created
            mImage = itemView.findViewById(R.id.img_place);
            mNameOfPlace = itemView.findViewById(R.id.txt_nameOfPlace);
            mPlaceDescription = itemView.findViewById(R.id.txt_placeDescription);
        }
    }
}
