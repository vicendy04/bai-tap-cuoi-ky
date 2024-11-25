package com.tranvodinhhoang.baitapcuoiky;

import android.widget.ImageView;

public class Post {
    String name;
    String title;
    ImageView photo;

    public Post(String name, String title, ImageView photo) {
        this.name = name;
        this.title = title;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageView getPhoto() {
        return photo;
    }

    public void setPhoto(ImageView photo) {
        this.photo = photo;
    }
}
