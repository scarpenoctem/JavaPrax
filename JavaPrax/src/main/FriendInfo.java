package main;

import Interfaces.PersonInfo;
import java.util.ArrayList;
import java.util.List;
/* Class to store, retrieve, and manipulate Friends' data
 * */
public class FriendInfo implements PersonInfo {

	//list that contains: age, height, occupation
	private List<String> friendInfo = new ArrayList<>();

	public void addFriend(List<String> friendInfo) {
		
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
