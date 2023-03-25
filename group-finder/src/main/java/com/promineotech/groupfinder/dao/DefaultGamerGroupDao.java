package com.promineotech.groupfinder.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.promineotech.groupfinder.entity.GamerGroup;

@Component
public class DefaultGamerGroupDao implements GamerGroupDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<GamerGroup> fetchGamerGroup() {
		
		String sql = "" 
				+ "SELECT * " 
				+ "FROM gamer_group ";
		
		
		return jdbcTemplate.query(sql, 
				new RowMapper<>() {
					@Override
					public GamerGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
						return GamerGroup.builder()
							.gamerGroupId(rs.getInt("gamer_group_id"))
							.groupId(rs.getInt("group_id"))
							.gamerId(rs.getInt("gamer_id"))
							.build();
					}});
			}

		}
