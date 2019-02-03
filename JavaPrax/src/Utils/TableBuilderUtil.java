package Utils;


import java.sql.ResultSet;
import java.sql.Statement;
import main.PracticeApp;


public class TableBuilderUtil {
	
	public static void buildAllTables() {
		try {
			System.out.println("Building All Tables...\n");
			buildFriendInfoTable();
			System.out.println("Building Tables was successful!\n");
		} catch (Exception e) {
			System.out.println("*** BUILDING ALL TABLES FAILED! ***\n");
			System.err.println(e);
		}
	}
	
	public static void buildFriendInfoTable() {
		try {
			System.out.println("Building friendInfo Table...");			
			Statement statement = PracticeApp.connection.createStatement();			
			String friendInfo = "CREATE TABLE IF NOT EXISTS REGISTRATION"
					+ "(id INTEGER auto increment, "
					+ "firstName VARCHAR(255), "
					+ "lastName VARCHAR(255), "
					+ "age INTEGER(3), "
					+ "height INTERGER(3), "
					+ "occupation VARCHAR(255), "
					+ "PRIMARY KEY(id))";
			statement.executeUpdate(friendInfo);
			System.out.println("Building friendInfo Table was successful!\n");			
		} catch (Exception e) {
			System.out.println("*** BUILDING friendInfo TABLE FAILED! ***\n");
			System.err.println(e);
		}
	}

}
