package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    Post post = new Post();

    public Post[] search(int ownerId, String domain, boolean ownersOnly, int count, String query, int offset) {
        return null;
    }

    public void delete(int postId, int ownerId, boolean canDelete) {
    }
}
