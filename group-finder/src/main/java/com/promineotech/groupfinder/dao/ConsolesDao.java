package com.promineotech.groupfinder.dao;

import java.util.List;

import com.promineotech.groupfinder.entity.Consoles;

public interface ConsolesDao {

	List<Consoles> fetchConsoles(Integer consoleId, String consoleName, String consoleBrand);

}
