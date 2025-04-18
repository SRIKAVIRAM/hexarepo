package com.virtualartgallery.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.virtualartgallery.model.ArtWork;
import com.virtualartgallery.util.DbConnectionUtil;

public class VirtualArtGalleryImpl implements IVirtualArtGallery {
	
	static Connection connection;

	public void addArtork(ArtWork artwork) {
		
		connection = DbConnectionUtil.getConnection();

		String sql = "insert into artwork values(?,?,?,?,?,?)";
		
		PreparedStatement statement = null;

		try {

			statement = connection.prepareStatement(sql);
			statement.setInt(1, artwork.getArtworkId());
			statement.setString(2, artwork.getTitle());
			statement.setString(3, artwork.getDescription());			
			statement.setString(4, artwork.getCreationDate());
			statement.setString(5, artwork.getMedium());
			statement.setString(6, artwork.getImageUrl());			
			
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}
	}

	@Override
	public void updateArtwork(String medium, int artworkId) {
		connection = DbConnectionUtil.getConnection();

		String sql = "update artwork set medium =? where artworkId=? ";
		
		PreparedStatement statement = null;
		
		try {
			statement = connection.prepareStatement(sql);
			
			statement.setString(1,medium);
			statement.setInt(2,artworkId);
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		
		}
	}

	@Override
	public void removeArtwork(int artworkId) {
		{
			connection = DbConnectionUtil.getConnection();

			String sql = "delete artwork set medium =? where artworkId=? ";
			
			PreparedStatement statement = null;
			
			try {
				statement = connection.prepareStatement(sql);
				
				statement.setInt(1,artworkId);
				
				statement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {

				}
			
			}
		}

		
	}

	@Override
	public ArtWork getArtWorkById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchArtwork(int artworkId, String medium) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addArtWork(ArtWork artwork) {
		// TODO Auto-generated method stub
		
	}

}