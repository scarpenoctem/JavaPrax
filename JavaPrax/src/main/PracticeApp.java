package main;

import java.sql.Connection;
import java.sql.DriverManager;
import Utils.StringUtil;
import Utils.IntUtil;
import Utils.TableBuilderUtil;

public class PracticeApp {
	
	public static Connection connection;
	
	public static void main(String args[]) {
		
		System.out.println("Connecting to Database...");		
		try {
			Class.forName("org.h2.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:h2:" + "./Database/pracAppDB", "username", "password");
			System.out.println("Connection to pracAppDB was successful!\n");
		} catch (Exception e) {
			System.out.println("*** CONNECTION FAILED! ***\n");
			System.err.println(e.getMessage());
		}
		
		TableBuilderUtil.buildAllTables();
		
		//FriendInfo friendInfo = new FriendInfo();
		//friendInfo.addFriend();
		
		int x = 5;
		//IntUtil.isPrime(x);
		IntUtil.printFirstXPrimeNumbers(x);
	}	
}
