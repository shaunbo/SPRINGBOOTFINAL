package com.promineotech.groupfinder.entity;   //SHAUN PENMAN, TREVOR NELSON

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GamerGroup {
	
	private Integer gamerGroupId;
	private Integer groupId;
	private Integer gamerId;

}
