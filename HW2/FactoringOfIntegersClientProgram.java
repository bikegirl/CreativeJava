package HW2;

import java.util.Scanner;

public class FactoringOfIntegersClientProgram {
	
	public static void main(String[] args) {
		
		int myNum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number and I'll give you the factors of that number: ");
		
		myNum = scan.nextInt();
		
		//set FactorGenerator object with client number
		FactorGenerator clientNumber = new FactorGenerator(myNum);
		//create Printer Object
		FactorPrinter item = new FactorPrinter();
		
		//Determine all factors starting with 1
		System.out.println("The factors are: ");				
		while (clientNumber.getFactor() <= clientNumber.getNum()) {

			if (clientNumber.hasMoreFactors() == true) {
				//System.out.println("This is the boolean: " + clientNumber.hasMoreFactors());
				item.printFactorOf(clientNumber);				
			} 
		clientNumber.nextFactor();
		//System.out.println("Print nextFactor: " + clientNumber.getFactor());
		}
	System.out.println("\nNo more factors!");
	}

}
