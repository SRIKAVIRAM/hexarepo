package com.virtualartgallery.model;

public class FavoriteArtWork {
    private int userId;
    private int artworkId;

    public FavoriteArtWork() {}

    public FavoriteArtWork(int userId, int artworkId) {
        this.userId = userId;
        this.artworkId = artworkId;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getArtworkId() {
        return artworkId;
    }
    public void setArtworkId(int artworkId) {
        this.artworkId = artworkId;
    }

    @Override
    public String toString() {
        return "FavoriteArtwork [userId=" + userId + ", artworkId=" + artworkId + "]";
    }
}

