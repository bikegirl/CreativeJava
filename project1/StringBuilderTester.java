package HW1;

//import java.util.Scanner;

public class StringBuilderTester {
	
	public static void main(String[] args) {
		
		//Create an instance of StringBuilder that spells your name. Print this.
		StringBuilder name = new StringBuilder();
		name.append("Becca");
		System.out.println(name);
		
		
	
		//Add, delete, or modify at least 3 characters in this StringBuilder object 
		//to make it spell a different word of your choice. Print this word.
		StringBuilder newWord = new StringBuilder();
		newWord.append("November");
		System.out.println(newWord);
		System.out.println(newWord.reverse());
		newWord.reverse();
		System.out.println("November is the start of '"+ newWord.replace(0,1,"M") + "' season lol.");
		newWord.replace(0,1,"N");
		//newWord.reverse();
		System.out.println(newWord + " is abbreviated " + newWord.delete(3, newWord.length()));
		
		
	}
	
}
