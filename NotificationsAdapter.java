package com.example.ayena;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder> {
    private ArrayList<NotificationsItem> mNotificationsList;
    public static class NotificationsViewHolder extends RecyclerView.ViewHolder{
            public ImageView mImageView;
            public TextView mTextview1;
            public TextView mTextview2;
        public NotificationsViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageview_Notification);
            mTextview1 = itemView.findViewById(R.id.line1_txt);
            mTextview2 = itemView.findViewById(R.id.line2_txt);
        }
    }
    public NotificationsAdapter(ArrayList<NotificationsItem> notificationsList){
        mNotificationsList = notificationsList;
    }

    @NonNull
    @Override
    public NotificationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item,parent,false);
        NotificationsViewHolder nvh = new NotificationsViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationsViewHolder holder, int position) {
        NotificationsItem currentItem = mNotificationsList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextview1.setText(currentItem.getText1());
        holder.mTextview2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mNotificationsList.size();
    }
}
