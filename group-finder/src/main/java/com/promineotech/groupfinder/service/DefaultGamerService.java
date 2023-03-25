package com.promineotech.groupfinder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.promineotech.groupfinder.dao.GamerDao;
import com.promineotech.groupfinder.entity.Gamer;


@Service
public class DefaultGamerService implements GamerService {
	
	@Autowired
	private GamerDao gamerDao;	
	
	@Override    //READ
	public List<Gamer> fetchGamers(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerDao.fetchGamers(gamerId, gamerName, gamerEmail, gamerAge);
	}

	@Override    //UPDATE
	public Optional<Gamer> updateGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerDao.updateGamer(gamerId, gamerName, gamerEmail, gamerAge);
	}

	@Override   //CREATE
	@Transactional
	public Optional<Gamer> createGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerDao.saveGamer(gamerId, gamerName, gamerEmail, gamerAge);
	}

	

	@Override    //DELETE
	public Optional<Gamer> deleteGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		return gamerDao.deleteGamer(gamerId, gamerName, gamerEmail, gamerAge);
	}

}
