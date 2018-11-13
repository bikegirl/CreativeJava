import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SocialNetwork {
	
	public static void main(String[] args) {
		
		FileReader fr = new FileReader();
		ArrayList<String> textLines;
		try {
			textLines = fr.readSocialNetworkFile("friends.txt");
			ListCreator lc = new ListCreator(textLines);
			MapCreator mc = new MapCreator(textLines);
			NetworkAnalyzer na = new NetworkAnalyzer(lc, mc);
			System.out.println(na.getPersonNameWithMostFriendsList());
			System.out.println(na.getPersonNameWithMostFriendsMap());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
