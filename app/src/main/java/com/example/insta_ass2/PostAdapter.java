package com.example.insta_ass2;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private ArrayList<Post> posts;

    public PostAdapter(ArrayList<Post> posts) {
        this.posts=posts;
    }
    public class PostViewHolder extends RecyclerView.ViewHolder{
        public TextView txtTitle;
        public ImageView postImage;
        public TextView txtLikes;
        public ImageView imageViewLike,imgComment;


        public PostViewHolder(@NonNull View itemView){
            super(itemView);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            postImage=itemView.findViewById(R.id.imgShow);
            txtLikes=itemView.findViewById(R.id.txtLikesShow);
            imageViewLike=itemView.findViewById(R.id.imgLikes);
            imgComment=itemView.findViewById(R.id.imgComment);

            imgComment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), comment.class);

                                       v.getContext().startActivity(intent);



                }
            });

            imageViewLike.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            int like=Integer.parseInt(txtLikes.getText().toString());
                            like++;
                            txtLikes.setText(""+like);
                        }
                    });
     /*       postImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int likes;
                    likes=Integer.parseInt(txtLikes.getText().toString());
                    likes++;
                    txtLikes.setText(""+likes);
                }
            });*/
        }
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.post,null);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post=posts.get(position);
        holder.txtTitle.setText(post.getTitle());
        holder.postImage.setImageResource(post.getImage());
        holder.txtLikes.setText(""+post.getLikes());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
