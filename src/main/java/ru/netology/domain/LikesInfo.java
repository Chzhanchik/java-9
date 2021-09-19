package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikesInfo;
    private boolean canLike;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public boolean getCanPublish() {
        return canPublish;
    }

    public boolean getUserLikesInfo() {
        return userLikesInfo;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public void setUserLikesInfo(boolean userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }
}
