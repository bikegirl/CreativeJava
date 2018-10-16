package HW2;

public class QuadraticEquation {
	
	private int a;
	private int b;
	private int c;

	private int y;
	
	//default constructor
	public QuadraticEquation() {
		a = 1;
		b = 1;
		c = 1;	
	}
	
	//constructor that accepts 3 arguments
	QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	
	//return y given x intercept
	public int evaluateY (int x) {
		
		y = a*a + b*x + c;
		return y;
	}
	
	//accessor methods for a, b, c
	public int  getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	//mutator method, object set by the client
	public void setQuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;		
	}

}
