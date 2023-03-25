package com.promineotech.groupfinder.entity;    //TREVOR NELSON

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GameGroup {
	
	private Integer groupId;
	private String groupName;
	private Integer groupSize;
	private String groupNotes;

}
