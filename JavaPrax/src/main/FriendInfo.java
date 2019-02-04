package main;

import Interfaces.PersonInfo;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/* A custom table class to store, retrieve, and manipulate Friends' data
 * */
public class FriendInfo implements PersonInfo {

	public void addFriend(String firstName, String lastName, int age, int height, String occupation) {
		try {
			Statement statement = PracticeApp.connection.createStatement();
			/*TODO needs an if not exists condition written into the query to avoid adding a duplicate name. same first name would be ok...*/
			String sqlQuery = "insert into FRIENDINFO(firstName, lastName, age, height, occupation) values('"
			+ firstName + "', '" + lastName + "', " + age + ", " + height + ", '" + occupation + "')";
			int i = statement.executeUpdate(sqlQuery);
			System.out.println("Record " + i + " was inserted.");
		} catch(Exception e) {
			System.err.println(e);
		}

	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getOccupation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeFriend() {
		// TODO Auto-generated method stub
		
	}
	
}
