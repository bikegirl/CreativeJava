package HW1;

public class TroubleShooting {
	
	public static void main(String[] args) {
		
		int y = 2018;
		double a = y/19.00; //year divided by 19
		double b = y/100.00;//year divided by 100
		int c = y%100; //the remainder of year divided by 100
		System.out.println("Print a:" + a);
		System.out.println("Print b:" + b);
		System.out.println("Print c:" + c);

		double d = b/4.00; //divide b by 4
		int e = ((int) b) % 4; 
		System.out.println("Print d:" + d);
		System.out.println("Print e:" + e);

		double g = (8*b+13)/25.00; //divide (8*b+13) by 25
		int h = (int)((19.00*a+b-d-g+15.00)%30); //the remainder when you divide (19*a+b-d-g+15) by 30 
		System.out.println("Print g:" + g);
		System.out.println("Print h:" + h);

		double j = c/4.00; //divide c by 4
		int k = c%4; //the remainder of c divided by 4
		System.out.println("Print j:" + j);
		System.out.println("Print k:" + k);
		
		double m = (a+11.00*h)/319; //a+11*h by 319 to get a quotient m
		int r = (int)((2*e+2*j-k-h+m+32)%7); //the remainder of dividing (2*e+2*j-k-h+m+32)/7
		System.out.println("Print m:" + m);
		System.out.println("Print r:" + r);
		
		int n = (int) ((h-m+r+90)/25); //divide (h-m+r+90) by 25
		int p = (h-(int)m+r+n+19)%32; //the remainder of (h-m+r+n+19) by 32
		System.out.println("Print n:" + n);
		System.out.println("Print p:" + p);

	}
	
	/**
	 * 	int y; //year in format YYYY by the user
	 *	int a; //the reaminder of the year divided by 19
	 *	int b; //year divided by 100
	 *	int c; //the remainder of year divided by 100
	 *	int d; //divide b by 4
	 *	int e; //the remainder when b is divided by 4
	 *	int g; //divide (8*b+13) by 25
	 *	int h; //the remainder when you divide (19*a+b-d-g+15) by 30 
	 *	int j; //divide c by 4
	 *	int k; //the remainder of c divided by 4
	 *	int m; //a+11*h by 319 to get a quotient m
	 *	int r; //the remainder of dividing (2*e+2*j-k-h+m+32)/7
	 *	int n; //divide by (h-m+r+90) by 25
	 *	//then easter fall on day p of the month n
	 *	//For example, if y is 2001
	 */
}
