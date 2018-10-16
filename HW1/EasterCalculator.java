package HW1;

/**
 * The EasterCalculator Class takes in a year from the client and returns the 
 * Easter Date of that year using this very complicated algorithm.
 * @author bikegirl 
 *
 */

//Don't forget to add a constructor

public class EasterCalculator {
	
	private int month;
	private int day;
	
	//Default constructor if no value is entered
	EasterCalculator() {
		
		month = 1;
		day = 1;
	}

	/**
	 * Calculates the exact Easter date for the year passed from the client
	 * using a very complicated algorithm
	 */
	public void calculateEaster(int year){
		
		int y = year; //user input
		int a = y%19; //the remainder of year divided by 19
		int b = y/100;//year divided by 100
		int c = y%100; //the remainder of year divided by 100
		int d = b/4; //divide b by 4
		int e = b%4; //the remainder when b is divided by 4
		int g = (8*b+13)/25; //divide (8*b+13) by 25
		int h = (19*a+b-d-g+15)%30; //the remainder when you divide (19*a+b-d-g+15) by 30 
		int j = c/4; //divide c by 4
		int k = c%4; //the remainder of c divided by 4
		int m = (a+11*h)/319; //a+11*h by 319 to get a quotient m
		int r = (2*e+2*j-k-h+m+32)%7; //the remainder of dividing (2*e+2*j-k-h+m+32)/7
		int n = (h-m+r+90)/25; //divide by (h-m+r+90) by 25
		int p = (h-m+r+n+19)%32; //the remainder of (h-m+r+n+19) by 32
		
		month = n;
		day = p;
		
	}
	
	/**
	 * Returns the month of the Easter Date
	 */
	public int getMonth(){
		
		return month;
		
	}
	
	/**
	 * Returns the day of the Easter Date
	 */
	public int getDay(){
		
		return day;
		
	}

}
