package com.promineotech.groupfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.groupfinder.entity.Consoles;
import com.promineotech.groupfinder.service.ConsolesService;

@RestController
public class DefaultConsolesController implements ConsolesController {
	
	@Autowired
	private ConsolesService consoleService;

	@Override
	public List<Consoles> fetchConsoles(Integer consoleId, String consoleName, String consoleBrand) {
		return consoleService.fetchConsoles(consoleId, consoleName, consoleBrand);
	}

}
