package com.promineotech.groupfinder.service;

import java.util.List;
import java.util.Optional;

import com.promineotech.groupfinder.entity.Gamer;

public interface GamerService {
	
	//READ
	List<Gamer> fetchGamers(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge);
	
	//UPDATE
	Optional<Gamer> updateGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge);
	
	//CREATE
	Optional<Gamer> createGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge);
	
	//DELETE
	Optional<Gamer> deleteGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge);

}
