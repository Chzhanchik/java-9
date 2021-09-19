package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public boolean getCanPost() {
        return canPost;
    }

    public boolean getCanClose() {
        return canClose;
    }

    public boolean getGroupsCanPost() {
        return groupsCanPost;
    }

    public boolean getCanOpen() {
        return canOpen;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }
}