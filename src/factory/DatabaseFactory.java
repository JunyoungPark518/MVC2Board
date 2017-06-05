package factory;

import constants.Database;
import domain.DatabaseBean;
import enums.Vendor;

public class DatabaseFactory {
	public static DatabaseBean create(Vendor vendor, String username, String password){
		String driver = "", url = "";
		switch(vendor){
		case MYSQL : 
			driver = Database.MYSQL_DRIVER;
			url = Database.MYSQL_URL;
			break;
		default:
			break;
		}
		return new DatabaseBean(driver, url, username, password);
	}
}
