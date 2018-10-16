package HW2;

import java.util.Scanner;

public class QuadraticEquationClientProgram {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int x;
		
		Scanner scan = new Scanner(System.in);
		//Quadratic Equation Object using 3-argument constructor
		QuadraticEquation qe1 = new QuadraticEquation(1, 4, 3);
		//Quadratic Equation Object using default constructor to be set by client
		QuadraticEquation qe2 = new QuadraticEquation();

		
		//find y
		System.out.println("Evaluate y given specific x.  Enter value for x: ");
		x = scan.nextInt();
		System.out.printf("The solution given %d is: %d", x, qe1.evaluateY(x));
	
		//get values from user
		System.out.println("\n\n" + "Enter *a* for quadractic equation: ");
		a = scan.nextInt();
		
		System.out.println("Enter *b* for quadractic equation: ");
		b = scan.nextInt();
		
		System.out.println("Enter *c* for quadractic equation: ");
		c = scan.nextInt();
		
		//set QuadraticEquation Object with input from the client
		qe2.setQuadraticEquation(a, b, c);
		//Pass the QuadraticEquation Object to the Solver
		QuadraticEquationSolver solveQuadratic = new QuadraticEquationSolver(qe2);
		
		if (solveQuadratic.getD() < 0) {
			//you cannot take the square root of negative number
			System.out.println("\n" + "No Solution.  You cannot take the square root of a negative number.");
			System.out.println("The discriminant was:  " + solveQuadratic.getD());
			
		} else {
			//format solutions, use Solver Object to get solutions.
			System.out.printf("\n" + "The solutions are %f and %f", solveQuadratic.getSolution1(), solveQuadratic.getSolution2(), "\n");
			System.out.printf("\n" + "The smallest of the two solutions is %f", solveQuadratic.getSmallest());
		}
		

	}
}
		




