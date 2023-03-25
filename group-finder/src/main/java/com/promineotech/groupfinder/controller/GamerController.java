package com.promineotech.groupfinder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.groupfinder.entity.Gamer;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@OpenAPIDefinition(info = @Info(title = "Group Finder"), servers = {
	    @Server(url = "http://localhost:8080", description = "Local server.")})

@RequestMapping("/gamer")
public interface GamerController {
	
	@Operation(
		      summary = "Returns a list of Gamers",
		      description = "Returns a list of Gamers with personal information",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "A list of Gamers is returned.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = Gamer.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "No Gamers were found with input criteria.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  @Parameter(
			              name = "gamerId", 
			              allowEmptyValue = false, 
			              required = true, 
			              description = "The gamer id (i.e., '1')"),
		    		  @Parameter(
		                  name = "gamerName", 
		                  allowEmptyValue = false, 
		                  required = true, 
		                  description = "The gamer name (i.e., 'Shaun')"),
		    		  @Parameter(
		                  name = "gamerEmail", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The gamer email (i.e., '@gmail.com')"),
		    		  @Parameter(
		        		  name = "gamerAge", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The gamer age (i.e., '25')")
		      }
		  )
	@GetMapping         //READ
	  @ResponseStatus(code = HttpStatus.OK)
	  List<Gamer> fetchGamers(
			  @RequestParam
			  	Integer gamerId,
			  @RequestParam
				 String gamerName, 
				@RequestParam
				 String gamerEmail,
				@RequestParam
				 Integer gamerAge);
	
	@Operation(
		      summary = "Update Gamer",
		      description = "Returns updated Gamer",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "The gamer was updated.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = Gamer.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "The gamer compenents were not found.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  @Parameter( 
			                  name = "gamerId", 
			                  allowEmptyValue = false, 
			                  required = true, 
			                  description = "The gamer id (i.e., '1')"),
		          @Parameter( 
		                  name = "gamerName", 
		                  allowEmptyValue = false, 
		                  required = true, 
		                  description = "The gamer name (i.e., 'Shaun')"),
		          @Parameter(
		                  name = "gamerEmail", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The gamer email (i.e., '@gmail.com')"),
		          @Parameter(
		                  name = "gamerAge", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The gamer age (i.e., '25')")
		      }
		  )
	@PutMapping          //UPDATE
	@ResponseStatus(code = HttpStatus.OK)
	Optional<Gamer> updateGamer(
			@RequestParam
			Integer gamerId,
			@RequestParam
			 String gamerName, 
			@RequestParam
			 String gamerEmail,
			@RequestParam
			 Integer gamerAge);
	
	
	@Operation(
		      summary = "Create new Gamer",
		      description = "Returns a new Gamer",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "The created gamer is returned.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = Gamer.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "The gamer compenents were not found.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  /*@Parameter(
			                  name = "gamerId",  
			                  required = true, 
			                  description = "The gamer id (i.e., '1')"),*/
		          @Parameter(
		                  name = "gamerName",  
		                  required = true, 
		                  description = "The gamer name (i.e., 'Shaun')"),
		          @Parameter(
		                  name = "gamerEmail",  
		                  required = true, 
		                  description = "The gamer email (i.e., '@gmail.com')"),
		          @Parameter(
		                  name = "gamerAge",  
		                  required = true, 
		                  description = "The gamer age (i.e., '25')")
		      
		      }
		  )
	
	@PostMapping   //CREATE
	@ResponseStatus(code = HttpStatus.CREATED)
	 
	Optional<Gamer> createGamer(
			@RequestParam(required = false)
			Integer gamerId,
			@RequestParam
			 String gamerName, 
			@RequestParam
			 String gamerEmail,
			@RequestParam
			 Integer gamerAge);
	
	
	@Operation(
		      summary = "Delete Gamer",
		      description = "Returns a new Gamer",
		      responses = {
		          @ApiResponse(
		                  responseCode = "200", 
		                  description = "The gamer was deleted.", 
		                  content = @Content(
		                          mediaType = "application/json", 
		                          schema = @Schema(implementation = Gamer.class))),    
		          @ApiResponse(
		                  responseCode = "400", 
		                  description = "The request parameters are invalid.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "404", 
		                  description = "The gamer was not found.",
		                  content = @Content(mediaType = "application/json")),    
		          @ApiResponse(
		                  responseCode = "500",
		                  description = "An unplanned error occurred.", 
		                  content = @Content(mediaType = "application/json")) 
		      },
		      parameters = {
		    		  @Parameter(
			                  name = "gamerId", 
			                  allowEmptyValue = false, 
			                  required = true, 
			                  description = "The gamer id (i.e., '1')"),
		          @Parameter(
		                  name = "gamerName", 
		                  allowEmptyValue = false, 
		                  required = true, 
		                  description = "The gamer name (i.e., 'Shaun')"),
		          @Parameter(
		                  name = "gamerEmail", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The gamer email (i.e., '@gmail.com')"),
		          @Parameter(
		                  name = "gamerAge", 
		                  allowEmptyValue = false,
		                  required = true, 
		                  description = "The gamer age (i.e., '25')")
		      }
		  )
	@DeleteMapping        //DELETE
	@ResponseStatus(code = HttpStatus.OK)
	Optional<Gamer> deleteGamer(
			@RequestParam
			Integer gamerId,
			@RequestParam 
			 String gamerName, 
			@RequestParam
			 String gamerEmail,
			@RequestParam
			 Integer gamerAge);
			
	  
	}

