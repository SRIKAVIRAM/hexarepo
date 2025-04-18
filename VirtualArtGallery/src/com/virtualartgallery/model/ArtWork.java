package com.virtualartgallery.model;

public class ArtWork {
    private int artworkId;
    private String title;
    private String description;
    private String creationDate;
    private String medium;
    private String imageUrl;
    private int artistId;

    public ArtWork(String string, String string2, String string3, String string4, String string5, int i) {}

    public ArtWork(int artworkId, String title, String description, String creationDate, String medium, String imageUrl, int artistId) {
        this.artworkId = artworkId;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.medium = medium;
        this.imageUrl = imageUrl;
        this.artistId = artistId;
    }

    public int getArtworkId() {
        return artworkId;
    }
    public void setArtworkId(int artworkId) {
        this.artworkId = artworkId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getMedium() {
        return medium;
    }
    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getArtistId() {
        return artistId;
    }
    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Override
    public String toString() {
        return "Artwork [artworkId=" + artworkId + ", title=" + title + ", description=" + description +
               ", creationDate=" + creationDate + ", medium=" + medium + ", imageUrl=" + imageUrl +
               ", artistId=" + artistId + "]";
    }
}

