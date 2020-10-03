package com.example.ayena;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedsAdapter extends RecyclerView.Adapter<FeedsAdapter.FeedsViewHolder> {
    private ArrayList<FeedsItem> mFeedsList;
    public static class FeedsViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextview1;
        public TextView mTextview2;
        public FeedsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageview_Feeds);
            mTextview1 = itemView.findViewById(R.id.line1_txt_feeds);
            mTextview2 = itemView.findViewById(R.id.line2_txt_feeds);
        }
    }
    public FeedsAdapter(ArrayList<FeedsItem> feedList){
        mFeedsList = feedList;
    }

    @NonNull
    @Override
    public FeedsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.feeds_item,parent,false);
        FeedsViewHolder fvh = new FeedsViewHolder(v);
        return fvh;
    }

    @Override
    public void onBindViewHolder(@NonNull FeedsViewHolder holder, int position) {
        FeedsItem currentItem = mFeedsList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextview1.setText(currentItem.getText1());
        holder.mTextview2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mFeedsList.size();
    }
}
