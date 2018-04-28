package com.example.yassine.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.yassine.recycler.adapters.RecyclerAdapter;
import com.example.yassine.recycler.models.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    public String[] names ={
            "Yassine", "James", "Paul", "Chris", "Eric",
            "Tim", "Fred", "Yoel", "Zack", "Zen"
    };
    public String[] descriptions ={
            "Description Number 1",
            "Description Number 2",
            "Description Number 3",
            "Description Number 4",
            "Description Number 5",
            "Description Number 6",
            "Description Number 7",
            "Description Number 8",
            "Description Number 9",
            "Description Number 10"
    };
    public int[] images ={
            R.drawable.avatar_1,
            R.drawable.avatar_2,
            R.drawable.avatar_3,
            R.drawable.avatar_4,
            R.drawable.avatar_5,
            R.drawable.avatar_1,
            R.drawable.avatar_2,
            R.drawable.avatar_3,
            R.drawable.avatar_4,
            R.drawable.avatar_5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView =(RecyclerView) findViewById(R.id.recycler_view);

        List<User> users =new ArrayList<>();

        for(int i = 0; i < names.length; i++){
            User user =new User();
            user.user_name =names[i];
            user.user_desc =descriptions[i];
            user.user_image =images[i];

            users.add(user);

        }

        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(this, users));


    }


}
