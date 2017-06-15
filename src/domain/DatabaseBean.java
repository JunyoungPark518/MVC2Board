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

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
