package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ProvideConnection {
	private static String driverName;
	private static String url;
	private static String userName;
	private static String password;
	static {
		ResourceBundle rb= ResourceBundle.getBundle("connectionDetails");
		driverName=rb.getString("db.driverName");
		url=rb.getString("db.url");
		userName=rb.getString("db.userName");
		password=rb.getString("db.password");
	}
      public static Connection provideConnection() {
    	  Connection conn=null;
    	  try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	    try {
				conn= DriverManager.getConnection(url,userName,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
    	    return conn;
      }
}
