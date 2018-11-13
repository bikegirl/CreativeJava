
public class FriendCount {
	
	private String name;
	private int count;
	
	FriendCount(String name, int count) {
		this.name=name;
		this.count=count;
	}
	
	public void inc(int c) {
		count += c;
	}

	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}
	
	

}
