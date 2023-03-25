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

import com.promineotech.groupfinder.entity.Consoles;

@Component
public class DefaultConsolesDao implements ConsolesDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Consoles> fetchConsoles(Integer consoleId, String consoleName, String consoleBrand) {
		
		String sql = "" 
				+ "SELECT * " 
				+ "FROM consoles ";
		
		Map<String, Object> params = new HashMap<>();
		params.put("console_id", consoleId);
		params.put("console_name", consoleName);
		params.put("console_brand", consoleBrand);
		
		return jdbcTemplate.query(sql, params, 
				new RowMapper<>() {
					@Override
					public Consoles mapRow(ResultSet rs, int rowNum) throws SQLException {
						return Consoles.builder()
							.consoleId(rs.getInt("console_id"))
							.consoleName(rs.getString("console_name"))
							.consoleBrand(rs.getString("console_brand"))
							.build();
					}});
			}

		}
