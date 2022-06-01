package com.example.insta_ass2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Post> posts;
    private PostAdapter postAdapter;
    private int[] imgarray;
    private ImageView imgLikes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setdata();
        init();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setdata() {

        imgarray=new int[]{R.drawable.img_1,R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.img,
                R.drawable.img_1,R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.img,R.drawable.img_1,
                R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.img};

        posts=new ArrayList<Post>();
        for(int i=0;i<imgarray.length;i++)
        {
            posts.add(
                    new Post(i,"post"+(i+1),imgarray[i],0,R.drawable.like,R.drawable.comment)
            );
        }



    }


    private void init() {

        recyclerView=findViewById(R.id.recyclerViewPost);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false));


        postAdapter=new PostAdapter(posts);
        recyclerView.setAdapter(postAdapter);

    }



}
