package com.promineotech.groupfinder.service;

import java.util.List;

import com.promineotech.groupfinder.entity.Consoles;

public interface ConsolesService {
	
	List<Consoles> fetchConsoles(Integer consoleId, String consoleName, String consoleBrand);

}
