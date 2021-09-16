package ru.netology.domain;

import java.awt.*;

public class LikesInfo {
    private int ownerId;
    private String ownerName;
    private Image ownerAvatar;
    private int count;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
