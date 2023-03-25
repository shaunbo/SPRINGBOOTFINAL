package com.promineotech.groupfinder.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.groupfinder.entity.Gamer;

@Component
public class DefaultGamerDao implements GamerDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override    //READ
	public List<Gamer> fetchGamers(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		
		String sql = "" 
				+ "SELECT * " 
				+ "FROM gamer ";
		
		Map<String, Object> params = new HashMap<>();
		params.put("gamer_id", gamerId.toString());
		params.put("gamer_name", gamerName);
		params.put("gamer_email", gamerEmail);
		params.put("gamer_age", gamerAge.toString());
		
		return jdbcTemplate.query(sql, params, 
				new RowMapper<>() {
					@Override
					public Gamer mapRow(ResultSet rs, int rowNum) throws SQLException {
						return Gamer.builder()
							.gamerId(rs.getInt("gamer_id"))
							.gamerName(rs.getString("gamer_name"))
							.gamerEmail(rs.getString("gamer_email"))
							.gamerAge(rs.getInt("gamer_age"))
							.build();
					}});
			}

	@Override    //UPDATE
	public Optional<Gamer> updateGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		
		String sql = ""
		        + "UPDATE gamer "
				+ "SET gamer_name = :gamer_name, gamer_email = :gamer_email, gamer_age = :gamer_age "
		        + "WHERE gamer_id = :gamer_id"; //AND gamer_name = :gamer_name AND gamer_email = :gamer_email AND gamer_age = :gamer_age";
		    
		    Map<String, Object> params = new HashMap<>();
		    params.put("gamer_id", gamerId);
		    params.put("gamer_name", gamerName);
			params.put("gamer_email", gamerEmail);
			params.put("gamer_age", gamerAge);
		    
		    jdbcTemplate.update(sql, params);
		    
		    return Optional.ofNullable(Gamer.builder()
		    	.gamerAge(gamerId)
		    	.gamerName(gamerName)
				.gamerEmail(gamerEmail)
				.gamerAge(gamerAge)
				.build());
		    
		  }


	@Override    //CREATE
	public Optional<Gamer> saveGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		String sql = ""
				+ "INSERT INTO gamer(gamer_name, gamer_email, gamer_age) VALUES (:gamer_name, :gamer_email, :gamer_age)";
		
		Map<String, Object> params = new HashMap<>();
		//params.put("gamer_id", gamerId);
		params.put("gamer_name", gamerName);
		params.put("gamer_email", gamerEmail);
		params.put("gamer_age", gamerAge);
		
		jdbcTemplate.update(sql, params);
		return Optional.ofNullable(Gamer.builder()
				//.gamerId(gamerId)
				.gamerName(gamerName)
				.gamerEmail(gamerEmail)
				.gamerAge(gamerAge)
				.build());
	}

	@Override    //DELETE
	public Optional<Gamer> deleteGamer(Integer gamerId, String gamerName, String gamerEmail, Integer gamerAge) {
		
		String sql = ""
		        + "DELETE from gamer "
		        + "WHERE gamer_id = :gamer_id"; //AND gamer_name = :gamer_name AND gamer_email = :gamer_email AND gamer_age = :gamer_age";
		    
		    Map<String, Object> params = new HashMap<>();
		    params.put("gamer_id", gamerId);
		    params.put("gamer_name", gamerName);
			params.put("gamer_email", gamerEmail);
			params.put("gamer_age", gamerAge);
		    
		    jdbcTemplate.update(sql, params);
		    return Optional.ofNullable(Gamer.builder()
		    	.gamerAge(gamerId)
		    	.gamerName(gamerName)
				.gamerEmail(gamerEmail)
				.gamerAge(gamerAge)
				.build());
		  }

		}