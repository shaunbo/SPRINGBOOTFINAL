package com.promineotech.groupfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.groupfinder.dao.VideoGameDao;
import com.promineotech.groupfinder.entity.GameGenre;
import com.promineotech.groupfinder.entity.VideoGames;

@Service
public class DefaultVideoGameService implements VideoGameService {
	
	@Autowired
	private VideoGameDao videoGameDao;

	@Override
	public List<VideoGames> fetchVideoGames(Integer gameId, String gameName, GameGenre genre, String esrbRating) {
		return videoGameDao.fetchVideoGames(gameId, gameName, genre, esrbRating);
	}

}
