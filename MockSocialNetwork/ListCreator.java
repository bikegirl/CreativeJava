import java.util.ArrayList;
import java.util.HashMap;

public class ListCreator {

	ArrayList<String> lines;
	ArrayList<FriendCount> friendsCount;
	
	ListCreator(ArrayList<String> lines) {
		this.lines=lines;
		friendsCount=new ArrayList<>();
		putFriendCountInList();
	}
	
	public void putFriendCountInList() {
		
		for(String line: lines) {
			String[] parts = line.split(":");
			//System.out.println(line);
	    	//the person name (left of the colon) is in index place 0 of the array
	    	String personName = parts[0];
	    	//the comma delimited friends(right of the colon) are in index place 1
	    	//now split the comma delimited friends into another array
	    	String[] friendList = parts[1].split(", ");
	    	boolean found = false;
	    	//need to search arraylist for the person's name
	    	//if found increment the friend count
	    	for(FriendCount fc: friendsCount) {
	    		if(fc.getName().equals(personName)) {
	    			System.out.println("it equals");
	    			fc.inc(friendList.length);
	    			found=true;
	    			break;
	    		} 
	    	}
	    	//if not in list create new FriendCount and add to list
	    	if(!found) {
	    		FriendCount newPerson = new FriendCount(personName, friendList.length);
	    		friendsCount.add(newPerson);
	    	}
		}
		
	}

	public ArrayList<FriendCount> getFriendsCount() {
		return friendsCount;
	}
	
	
		

}
