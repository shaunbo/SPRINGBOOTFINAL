package com.promineotech.groupfinder.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.groupfinder.entity.GameGenre;
import com.promineotech.groupfinder.entity.VideoGames;

@Component
public class DefaultVideoGameDao implements VideoGameDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<VideoGames> fetchVideoGames(Integer gameId, String gameName, GameGenre genre, String esrbRating) {
		
		String sql = "" 
				+ "SELECT * " 
				+ "FROM video_games ";
		
		Map<String, Object> params = new HashMap<>();
		params.put("game_id", gameId.toString());
		params.put("game_name", gameName);
		params.put("genre", genre.toString());
		params.put("ESRB_rating", esrbRating);
		
		return jdbcTemplate.query(sql, params, 
				new RowMapper<>() {
					@Override
					public VideoGames mapRow(ResultSet rs, int rowNum) throws SQLException {
						return VideoGames.builder()
							.gameId(rs.getInt("game_id"))
							.gameName(rs.getString("game_name"))
							.genre(GameGenre.valueOf(rs.getString("genre")))
							.esrbRating(rs.getString("ESRB_rating"))
							.build();
					}});
			}

		}
