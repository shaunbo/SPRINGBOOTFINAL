package com.promineotech.groupfinder.dao;

import java.util.List;

import com.promineotech.groupfinder.entity.GameGenre;
import com.promineotech.groupfinder.entity.VideoGames;

public interface VideoGameDao {

	List<VideoGames> fetchVideoGames(Integer gameId, String gameName, GameGenre genre, String esrbRating);

}
