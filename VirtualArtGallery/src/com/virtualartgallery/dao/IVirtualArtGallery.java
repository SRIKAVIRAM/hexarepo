package com.virtualartgallery.dao;

import com.virtualartgallery.model.ArtWork;

public interface IVirtualArtGallery {
	
	void addArtWork(ArtWork artwork);
	void updateArtwork(String medium,int arworkId);
	void removeArtwork(int artworkId);
	
	ArtWork getArtWorkById();
	
	void searchArtwork(int artworkId,String medium);
	
	

}