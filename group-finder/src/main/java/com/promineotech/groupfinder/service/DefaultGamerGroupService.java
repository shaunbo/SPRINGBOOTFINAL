package com.promineotech.groupfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.groupfinder.dao.GamerGroupDao;
import com.promineotech.groupfinder.entity.GamerGroup;

@Service
public class DefaultGamerGroupService implements GamerGroupService {
	
	@Autowired
	private GamerGroupDao gamerGroupDao;

	@Override
	public List<GamerGroup> fetchGamerGroup() {
		return gamerGroupDao.fetchGamerGroup();
	}

}
