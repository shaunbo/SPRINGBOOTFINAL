package com.promineotech.groupfinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.groupfinder.entity.GamerGroup;
import com.promineotech.groupfinder.service.GamerGroupService;

@RestController
public class DefaultGamerGroupController implements GamerGroupController {
	
	@Autowired
	private GamerGroupService gamerGroupService;

	@Override
	public List<GamerGroup> fetchGamerGroup() {
		return gamerGroupService.fetchGamerGroup();
	}

}
