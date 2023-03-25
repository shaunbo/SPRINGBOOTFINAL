package com.promineotech.groupfinder.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.groupfinder.entity.GameGenre;
import com.promineotech.groupfinder.entity.VideoGames;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "Group Finder"), servers = {
	    @Server(url = "http://localhost:8080", description = "Local server.")})

@RequestMapping("/videogame")
public interface VideoGameController {

	@Operation(
		      summary = "Returns a list of Video Games",
		      description = "Returns a list of VideoGames",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "A list of Video Games is returned.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = VideoGames.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "No Video Games were found with input criteria.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  @Parameter(
			                  name = "gameId", 
			                  allowEmptyValue = false, 
			                  required = true, 
			                  description = "The video game name (i.e., '1')"),
		          @Parameter(
		                  name = "gameName", 
		                  allowEmptyValue = false, 
		                  required = true, 
		                  description = "The video game name (i.e., 'Dota')"),
		          @Parameter(
		                  name = "genre", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The video game genre (i.e., 'RPG')"),
		          @Parameter(
		                  name = "esrbRating", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The video game rating (i.e., 'T')")
		      }
		  )
	@GetMapping
	  @ResponseStatus(code = HttpStatus.OK)
	  List<VideoGames> fetchVideoGames(
			  @RequestParam(required = false)
			  Integer gameId,
			@RequestParam(required = false) 
			 String gameName, 
			@RequestParam(required = false) 
			 GameGenre genre,
			@RequestParam(required = false)
			 String esrbRating);
			
	  
	}
