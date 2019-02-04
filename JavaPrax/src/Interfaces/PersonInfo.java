package Interfaces;

public interface PersonInfo {
	
	public void addFriend(String firstName, String lastName, int age, int height, String occupation);
	public void removeFriend();
	public String getName();
	public int getAge();
	public int getHeight();
	public String getOccupation();
	
	
}
