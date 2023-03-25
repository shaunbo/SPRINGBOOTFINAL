package com.promineotech.groupfinder.dao;

import com.promineotech.groupfinder.entity.GameGroup;

public interface GroupDao {

	GameGroup saveGroup(Integer groupId, String groupName, Integer groupSize, String groupNotes);

}
