package com.example.yassine.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Yassine on 4/28/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView user_image;
    public TextView user_name;
    public TextView user_desc;
    public LinearLayout linearLayout;

    public ViewHolder(View itemView) {
        super(itemView);

        user_image =(ImageView) itemView.findViewById(R.id.user_image);
        user_name =(TextView) itemView.findViewById(R.id.user_name);
        user_desc =(TextView) itemView.findViewById(R.id.user_desc);
        linearLayout =(LinearLayout) itemView.findViewById(R.id.list_item);

    }


}
