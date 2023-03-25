package com.promineotech.groupfinder.entity;   //SHAUN PENMAN

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoGames {
	
	private Integer gameId;
	private String gameName;
	private GameGenre genre;
	private String esrbRating;
	private Integer consoleId;

}
