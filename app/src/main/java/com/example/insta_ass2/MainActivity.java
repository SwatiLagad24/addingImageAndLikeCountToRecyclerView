package com.example.insta_ass2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerViewPost;
    private Post post;
    private ArrayList<Post> posts;
    private int[] imgShow;
    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setdata();

    }
    private void setdata() {
        imgShow = new int[]{R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.img, R.drawable.img_1


        };

        posts = new ArrayList<Post>();

        for (int i = 1; i < imgShow.length; i++) {

            posts
                    .add(
                            new Post(i, "post" + i, imgShow[i], 0));


        }
    }

    private  void init()
    {

        recyclerViewPost=findViewById(R.id.recyclerViewPost);
        recyclerViewPost.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false

        ));
        postAdapter=new PostAdapter(posts);
        recyclerViewPost.setAdapter(postAdapter);

    }
}