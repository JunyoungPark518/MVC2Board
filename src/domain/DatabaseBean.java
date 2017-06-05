package domain;

import java.sql.Connection;
import java.sql.DriverManager;

import constants.Database;

public class DatabaseBean {
	private String driver, url, username, password;
	private Connection conn;
	
	public Connection getConnection(){
		try {
			Class.forName(Database.MYSQL_DRIVER);
			conn = DriverManager.getConnection(Database.MYSQL_URL, Database.USERNAME, Database.PASSWORD);
		} catch(Exception e){
			
		}
		return conn;
	}
	
	public DatabaseBean(String driver, String url, String username, String password) {
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
}
