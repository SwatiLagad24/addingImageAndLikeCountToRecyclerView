package com.example.insta_ass2;

import java.io.Serializable;

public class Post{
    private int id;
    private String title;
    private  int image;
    private int likes;
    public Post(int id,String title,int image,int likes){
        this.id=id;
        this.title=title;
        this.image=image;
        this.likes=likes;
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
}


