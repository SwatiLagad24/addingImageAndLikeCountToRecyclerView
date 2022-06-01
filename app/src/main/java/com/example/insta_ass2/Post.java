package com.example.insta_ass2;

import java.io.Serializable;

public class Post{
    private int id;
    private String title;
    private  int image;
    private int likes;
    private int likeImageId;
    private int comment;
    public Post(int id, String title, int image, int likes, int like, int comment){
        this.id=id;
        this.title=title;
        this.image=image;
        this.likes=likes;
        this.likeImageId=likeImageId;
        this.comment=comment;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(int likes) {
        this.likes = likes;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getLikeImageId() {
        return likeImageId;
    }

    public void setLikeImageId(int likeImageId) {
        this.likeImageId = likeImageId;
    }

    public int getComment(){return comment;}
    public void setComment(int comment)
    {
        this.comment=comment;
    }

}


