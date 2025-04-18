package com.virtualartgallery.main;

import com.virtualartgallery.model.ArtWork;
import com.virtualartgallery.model.Artist;
import com.virtualartgallery.model.FavoriteArtWork;
import com.virtualartgallery.model.Gallery;
import com.virtualartgallery.model.User;

public class VirtualArtGallery {
    public static void main(String[] args) {
        // Create Artist
        Artist artist = new Artist(1, "Vincent", "Dutch Impressionist painter",
                "1853-03-30", "Draw", "https://van.com", "info@va.com");

        // Create Artwork
        ArtWork artwork = new ArtWork("Theforest", "A painting of a forest", "2022-05-01", "Oil on Canvas", "images/forest.jpg", 21);

        // Create Gallery
        Gallery gallery = new Gallery(1001, "Nature's Touch", "A gallery focusing on nature-themed artworks.", "Chennai", 21, "10:00 AM - 6:00 PM");

        // Create User
        User user = new User(11, "arun", "aruns@123", "arunra@gmail.com", "Arun", "Kumar", "2005-06-15", "arun.jpg");

        // Create FavoriteArtWork
        FavoriteArtWork fav = new FavoriteArtWork(11, 1);

        // Print All Objects
        System.out.println(artist);
        System.out.println(artwork);
        System.out.println(gallery);
        System.out.println(user);
        System.out.println(fav);
        System.out.println("values added");
    }
}

