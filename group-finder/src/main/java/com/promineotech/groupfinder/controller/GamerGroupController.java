package com.promineotech.groupfinder.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.groupfinder.entity.GamerGroup;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "Group Finder"), servers = {
	    @Server(url = "http://localhost:8080", description = "Local server.")})

@RequestMapping("/gamergroup")
public interface GamerGroupController {
	
	@Operation(
		      summary = "Returns a list of Gamer Groups",
		      description = "Returns a list of VideoGames",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "A list of Gamer Groups is returned.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = GamerGroup.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "No Gamer Group were found with input criteria.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      }
		      
		  )
	@GetMapping
	  @ResponseStatus(code = HttpStatus.OK)
	  List<GamerGroup> fetchGamerGroup();
			
	}

