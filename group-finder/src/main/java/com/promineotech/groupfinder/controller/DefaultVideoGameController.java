package com.promineotech.groupfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.groupfinder.entity.GameGenre;
import com.promineotech.groupfinder.entity.VideoGames;
import com.promineotech.groupfinder.service.VideoGameService;

@RestController
public class DefaultVideoGameController implements VideoGameController {
	
	@Autowired
	private VideoGameService videoGameService;

	@Override
	public List<VideoGames> fetchVideoGames(Integer gameId, String gameName, GameGenre genre, String esrbRating) {
		return videoGameService.fetchVideoGames(gameId, gameName, genre, esrbRating);
	}

}
