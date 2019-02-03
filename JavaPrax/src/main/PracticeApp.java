package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Utils.StringUtil;
import Utils.TableBuilderUtil;

public class PracticeApp {
	
	public static Connection connection;
	
	public static void main(String args[]) {
		
		System.out.println("Connecting to Database...\n");		
		try {
			Class.forName("org.h2.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:h2:" + "./Database/pracAppDB", "username", "password");
			System.out.println("Connection to pracAppDB was successful!\n");
		} catch (Exception e) {
			System.out.println("*** CONNECTION FAILED! ***\n");
			System.err.println(e.getMessage());
		}
		
		TableBuilderUtil.buildAllTables();
	}	
}
