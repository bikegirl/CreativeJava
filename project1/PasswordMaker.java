package HW1;

public class PasswordMaker {
		
	public static void main(String[] args) {
		
		System.out.println("Password must have 20-30 characters,"
				+ "at least one decimal number, symbol, and letter.");
		
		//Initialized with a general password
		StringBuilder newPassword = new StringBuilder("HouseTargaryen");
		
		//Adding the decimal requirement to password 
		newPassword.replace(3, 4, "5");
		System.out.println(newPassword);
		
		//Adding symbol requirement to password
		newPassword.replace(6, 7, "@");
		System.out.println(newPassword);
		
		//Adding an additional decimal to passcode for funsies
		newPassword.replace(12, 13, "3");
		System.out.println(newPassword);
		
		//Ensuring character is at least 20-30 characters long
		newPassword.append("GameOfThrones");
		
		//Final print
		System.out.println("Now the password meets all Criteria:  " + newPassword);
		System.out.println("length of new Password:  " + newPassword.length());
	}

}
