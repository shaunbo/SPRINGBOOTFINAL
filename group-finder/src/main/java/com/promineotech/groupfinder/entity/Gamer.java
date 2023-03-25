package com.promineotech.groupfinder.entity;    //SHAUN PENMAN

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Gamer {
	
	private Integer gamerId;
	private String gamerName;
	private String gamerEmail;
	private Integer gamerAge;

}
