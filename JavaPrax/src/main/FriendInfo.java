package main;

import Interfaces.PersonInfo;
import java.util.ArrayList;
import java.util.List;
/* A custom table class to store, retrieve, and manipulate Friends' data
 * */
public class FriendInfo implements PersonInfo {

	//list that contains: age, height, occupation
	private List<String> friendInfo = new ArrayList<>();

	public void addFriend() {
		String tempStr = "";
		int tempInt = 0;
		// TODO Work in progress, was thinking that all friend data would come here and 
		// be separated from whatever sub structure and then be passed to the implemented 
		// methods to then be added to the table structure that will house all friend data...
		// (could use a DB but thats no fun... was thinking do it the hard way)
		addName(tempStr);
		addAge(tempInt);
		addHeight(tempInt);
		addOccupation(tempStr);
	}

	@Override
	public void addName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addHeight(int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addOccupation(String occupation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getOccupation() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
