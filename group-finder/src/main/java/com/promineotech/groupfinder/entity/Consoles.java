package com.promineotech.groupfinder.entity;    //TREVOR NELSON

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Consoles {
	
	private Integer consoleId;
	private String consoleBrand;
	private String consoleName;

}
