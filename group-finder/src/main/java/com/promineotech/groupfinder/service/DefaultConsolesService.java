package com.promineotech.groupfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.groupfinder.dao.ConsolesDao;
import com.promineotech.groupfinder.entity.Consoles;

@Service
public class DefaultConsolesService implements ConsolesService {
	
	@Autowired
	private ConsolesDao consolesDao;

	@Override
	public List<Consoles> fetchConsoles(Integer consoleId, String consoleName, String consoleBrand) {
		return consolesDao.fetchConsoles(consoleId, consoleName, consoleBrand);
	}

}
