package HW2;

import java.util.Scanner;

public class FactoringOfIntegersEasy {
	
	public static void main(String[] args) {
		
		int myNum;
		int factorFinder = 1;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number and I'll give you the factors of that number: ");
		myNum = scan.nextInt();
		
		System.out.println("The factors are: ");				
		while (factorFinder <= myNum) {

			if (myNum % factorFinder == 0) {
				System.out.print(factorFinder + " ");
			}
			factorFinder++;
		}
	}
		
}
