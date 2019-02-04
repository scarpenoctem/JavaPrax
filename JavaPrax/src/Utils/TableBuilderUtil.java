package Utils;

import java.sql.Statement;
import main.PracticeApp;


public class TableBuilderUtil {
	
	public static void buildAllTables() {
			System.out.println("Building All Tables...\n");
			buildFriendInfoTable();
	}
	
	public static void buildFriendInfoTable() {
		try {
			System.out.println("Building friendInfo Table...");			
			Statement statement = PracticeApp.connection.createStatement();			
			String sqlQuery = "CREATE TABLE IF NOT EXISTS FRIENDINFO"
					+ "(id INTEGER auto_increment, "
					+ "firstName VARCHAR(255), "
					+ "lastName VARCHAR(255), "
					+ "age INTEGER(3), "
					+ "height INTEGER(3), "
					+ "occupation VARCHAR(255), "
					+ "PRIMARY KEY(id))";
			statement.executeUpdate(sqlQuery);
			System.out.println("Building friendInfo Table was successful!\n");			
		} catch (Exception e) {
			System.out.println("*** BUILDING friendInfo TABLE FAILED! ***\n");
			System.err.println(e);
		}
	}

}
