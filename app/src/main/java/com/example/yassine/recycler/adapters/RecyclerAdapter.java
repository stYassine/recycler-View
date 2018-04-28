package com.example.yassine.recycler.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yassine.recycler.R;
import com.example.yassine.recycler.ViewHolder;
import com.example.yassine.recycler.models.User;

import java.util.List;

/**
 * Created by Yassine on 4/28/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<User> usersList;
    public Context context;

    public RecyclerAdapter(Context context, List<User> usersList) {
        this.usersList = usersList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        User sampleUser =usersList.get(position);
        holder.user_name.setText(sampleUser.user_name);
        holder.user_desc.setText(sampleUser.user_desc);
        holder.user_image.setImageResource(sampleUser.user_image);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, usersList.get(position).user_name, Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }


}
