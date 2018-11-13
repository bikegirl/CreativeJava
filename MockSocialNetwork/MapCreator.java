import java.util.ArrayList;
import java.util.HashMap;

public class MapCreator {
	
	ArrayList<String> lines;
	HashMap<String, Integer> map;
	
	MapCreator(ArrayList<String> lines) {
		this.lines=lines;
		map=new HashMap<>();
		putFriendCountInMap();
	}
	
	public void putFriendCountInMap() {
		
		for(String line: lines) {
			String[] parts = line.split(":");
	    	//the person name (left of the colon) is in index place 0 of the array
	    	String personName = parts[0];
	    	//the comma delimited friends(right of the colon) are in index place 1
	    	//now split the comma delimited friends into another array
	    	String[] friendList = parts[1].split(", ");
	    	if(map.containsKey(personName)) {
	    		
	    		int friends=map.get(personName);
	    		friends+=friendList.length;
	    		map.put(personName, friends);
	    	} else {
	    		map.put(personName, friendList.length);
	    	}
		}
		
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}
		

}
