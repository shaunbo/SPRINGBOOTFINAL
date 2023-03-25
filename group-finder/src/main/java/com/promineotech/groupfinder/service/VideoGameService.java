package com.promineotech.groupfinder.service;

import java.util.List;

import com.promineotech.groupfinder.entity.GameGenre;
import com.promineotech.groupfinder.entity.VideoGames;

public interface VideoGameService {
	
	List<VideoGames> fetchVideoGames(Integer gameId, String gameName, GameGenre genre, String esrbRating);

}
