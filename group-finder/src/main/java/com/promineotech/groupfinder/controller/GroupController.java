package com.promineotech.groupfinder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.groupfinder.entity.GameGroup;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@OpenAPIDefinition(info = @Info(title = "Jeep Order Service"), servers = {
    @Server(url = "http://localhost:8080", description = "Local server.")})

@RequestMapping("/groups")
public interface GroupController {

	@Operation(
		      summary = "Create a Group",
		      description = "Returns the created Group",
		      responses = {
		          @ApiResponse(
		                  responseCode = "201", 
		                  description = "The created Group is returned.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = GameGroup.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "A Group was not found.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  /*@Parameter(
			                  name = "groupId",  
			                  required = true, 
			                  description = "The group id (i.e., '1')"),*/
		    		  @Parameter(
			                  name = "groupName",  
			                  required = true, 
			                  description = "The group name (i.e., 'The Slayers')"),
			          @Parameter(
			                  name = "groupSize",  
			                  required = true, 
			                  description = "The group size (i.e., '5')"),
			          @Parameter(
			                  name = "groupNotes",  
			                  required = true, 
			                  description = "The group notes (i.e., 'play time')")
		      }
		  )
		  
		  @PostMapping
		  @ResponseStatus(code = HttpStatus.CREATED)
	GameGroup createGroup(
			@RequestParam(required = false)
			Integer groupId,
			@RequestParam
			 String groupName, 
			@RequestParam 
			 Integer groupSize,
			@RequestParam
			 String groupNotes);
				
		}
