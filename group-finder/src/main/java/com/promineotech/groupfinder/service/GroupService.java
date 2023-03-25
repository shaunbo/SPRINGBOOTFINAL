package com.promineotech.groupfinder.service;

import com.promineotech.groupfinder.entity.GameGroup;

public interface GroupService {
	
	GameGroup createGroup(Integer groupId, String groupName, Integer groupSize, String groupNotes);

}
