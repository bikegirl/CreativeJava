package HW1;
/**
 * A palindrome is a word or sequence of characters that is spelled the same way 
 * backwards and forwards. For example, "Otto" is a palindrome because reversed 
 * it still spells "ottO". Modify your StringBuilder object to be a palindrome. 
 * (It must be at least 4 characters long, but there is no limit to how long it 
 * can be.) Print this palindrome.
 * @author bikegirl
 *
 */



public class Palindrome {
	
	public static void main(String[] args) {
		
	
	
	StringBuilder Palindrome1 = new StringBuilder("Rotator");
	StringBuilder Palindrome2 = new StringBuilder("Racecar");
	StringBuilder Palindrome3 = new StringBuilder("kayaK");
	
	System.out.println(Palindrome1.reverse());
	System.out.println(Palindrome2.reverse());
	System.out.println(Palindrome3.reverse());
	
	}

}
