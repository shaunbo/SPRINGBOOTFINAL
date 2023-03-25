package com.promineotech.groupfinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.promineotech.groupfinder.dao.GroupDao;
import com.promineotech.groupfinder.entity.GameGroup;

@Service
public class DefaultGroupService implements GroupService {
	
	@Autowired
	  private GroupDao groupDao;

	@Transactional
	@Override
	public GameGroup createGroup(Integer groupId, String groupName, Integer groupSize, String groupNotes) {
		return groupDao.saveGroup(groupId, groupName, groupSize, groupNotes);

	}
}
	

