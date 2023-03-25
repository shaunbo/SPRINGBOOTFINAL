package com.promineotech.groupfinder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.groupfinder.entity.Gamer;
import com.promineotech.groupfinder.service.GamerService;

@RestController
public class DefaultGamerController implements GamerController {
	
	@Autowired
	private GamerService gamerService;

	@Override      //READ
	public List<Gamer> fetchGamers(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerService.fetchGamers(gamerId, gamerName, gamerEmail, gamerAge);
	}

	@Override     //UPDATE
	public Optional<Gamer> updateGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerService.updateGamer(gamerId, gamerName, gamerEmail, gamerAge);
	}

	@Override    //CREATE
	public Optional<Gamer> createGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerService.createGamer(gamerId, gamerName, gamerEmail, gamerAge);
	}

	@Override    //DELETE
	public Optional<Gamer> deleteGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerService.deleteGamer(gamerId, gamerName, gamerEmail, gamerAge);
	}

}
