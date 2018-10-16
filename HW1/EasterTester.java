package HW1;

import java.util.Scanner;

public class EasterTester {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userYear = 0000;
		
		EasterCalculator e1 = new EasterCalculator();
		
		System.out.println("Enter a year to find out when easter is: ");
		userYear = scan.nextInt();
		e1.calculateEaster(userYear);
		
		System.out.println("Easter for " + userYear + " is on month: " + e1.getMonth() + " and this day: " + e1.getDay());
		
		}

}
