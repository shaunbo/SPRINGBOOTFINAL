package com.promineotech.groupfinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.groupfinder.entity.GameGroup;
import com.promineotech.groupfinder.service.GroupService;

@RestController
public class DefaultGroupController implements GroupController {
	
	@Autowired
	private GroupService groupService;

	@Override
	public GameGroup createGroup(Integer groupId, String groupName, Integer groupSize, String groupNotes) {
		return groupService.createGroup(groupId, groupName, groupSize, groupNotes);
	}

}
