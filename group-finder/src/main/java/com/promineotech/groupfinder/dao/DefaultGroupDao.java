package com.promineotech.groupfinder.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.promineotech.groupfinder.entity.GameGroup;

@Component
public class DefaultGroupDao implements GroupDao {
	
	@Autowired
	  private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public GameGroup saveGroup(Integer groupId, String groupName, Integer groupSize, String groupNotes) {
		String sql = ""
		        + "INSERT INTO game_group(group_name, group_size, group_notes) VALUES (:group_name, :group_size, :group_notes)";
		    
		    Map<String, Object> params = new HashMap<>();
		    //params.put("group_id", groupId);
		    params.put("group_name", groupName);
			params.put("group_size", groupSize);
			params.put("group_notes", groupNotes);
		    
		    jdbcTemplate.update(sql, params);
		    
		    return GameGroup.builder()
		    	//.groupId(groupId)
		    	.groupName(groupName)
				.groupSize(groupSize)
				.groupNotes(groupNotes)
				.build();
		    
		  }
}
