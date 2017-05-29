package com.example.latitude.helpme.viewHolder;

/**
 * Created by LATITUDE on 29/05/2017.
 */
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.latitude.helpme.R;
import com.example.latitude.helpme.models.Service;

public class ServiceViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public ImageView imageView;

    public ServiceViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView) itemView.findViewById(R.id.service_title);
        //imageView = (Image) itemView.findViewById(R.id.service_image);
    }

    public void bindToPost(Service service, View.OnClickListener starClickListener) {
        titleView.setText(service.title);

        //imageView.setImageResource(service.image);
    }
}
