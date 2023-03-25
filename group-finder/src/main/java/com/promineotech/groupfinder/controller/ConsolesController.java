package com.promineotech.groupfinder.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.promineotech.groupfinder.entity.Consoles;
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

@RequestMapping("/consoles")
public interface ConsolesController {

	@Operation(
		      summary = "Returns a list of Consoles",
		      description = "Returns a list of Consoles with Name and Brand",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "A list of Consoles is returned.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = Consoles.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "No Consoles were found with input criteria.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  @Parameter(
			                  name = "consoleId", 
			                  allowEmptyValue = false, 
			                  required = true, 
			                  description = "The console id (i.e., '1')"),
		          @Parameter(
		                  name = "consoleName", 
		                  allowEmptyValue = false, 
		                  required = true, 
		                  description = "The console name (i.e., 'Xbox')"),
		          @Parameter(
		                  name = "consoleBrand", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The console brand (i.e., 'Microsoft')")   
		      
		      }
		  )
	@GetMapping
	  @ResponseStatus(code = HttpStatus.OK)
	  List<Consoles> fetchConsoles(
			  @RequestParam(required = false)
			  Integer consoleId,
			@RequestParam(required = false) 
			 String consoleName, 
			@RequestParam(required = false) 
			 String consoleBrand);	
	  
	}