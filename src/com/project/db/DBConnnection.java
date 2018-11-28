package com.project.db;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class DBConnnection {

	@Autowired
	private DriverManagerDataSource dataSource;
	
	public static Connection conn;

	public Connection connect() throws Exception {
		try {
			conn =dataSource.getConnection();
			return conn;
		} catch (Exception e) {
			throw new Exception("Database connection exception.");
		}
	}

}
