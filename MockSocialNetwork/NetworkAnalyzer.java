import java.util.HashMap;
import java.util.Set;

public class NetworkAnalyzer {
	
	ListCreator lc;
	MapCreator mc;
	
	NetworkAnalyzer(ListCreator lc, MapCreator mc) {
		this.lc=lc;
		this.mc=mc;
	}
	
	public String getPersonNameWithMostFriendsList() {
		int max=0;
		String maxFriendsName=null;
		for(FriendCount fc: lc.getFriendsCount()) {
			if(fc.getCount()>max) {
				max=fc.getCount();
				maxFriendsName=fc.getName();				
			}
		}
		System.out.println("map "+maxFriendsName+" has "+max+" friends");
		return maxFriendsName;
	}
	
	public String getPersonNameWithMostFriendsMap() {
		int max=0;
		String maxFriendsName=null;
		HashMap<String, Integer> map = mc.getMap();
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			if(map.get(key)>max) {
				max=map.get(key);
				maxFriendsName=key;				
			}
		}
		System.out.println("map "+maxFriendsName+" has "+max+" friends");
		return maxFriendsName;
	}


}
