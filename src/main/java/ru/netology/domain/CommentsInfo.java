package ru.netology.domain;

import java.awt.*;

public class CommentsInfo {
    private int ownerId;
    private String ownerName;
    private Image ownerAvatar;
    private boolean canPost;
    private String text;
    private int count;
    private int date;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Image getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(Image ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}


