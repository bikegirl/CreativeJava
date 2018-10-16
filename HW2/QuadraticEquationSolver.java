package HW2;

public class QuadraticEquationSolver {
	
	private QuadraticEquation myObject;
	private double solution1;
	private double solution2;
	private double d;
	
	//default constructor
	QuadraticEquationSolver(){
		myObject.setQuadraticEquation(1, 1, 1);
	}
	
	//constructor set by client
	QuadraticEquationSolver(QuadraticEquation passedObject){

		//calculate the discriminant
		d = passedObject.getB()*passedObject.getB() - 4*passedObject.getA()*passedObject.getC();
		
		//find both solutions
		solution1 = (-passedObject.getB()-Math.sqrt(d))/(2*passedObject.getA());  
		solution2 = (-passedObject.getB()+Math.sqrt(d))/(2*passedObject.getA());	
	}
		
	//accessor methods
	public double getD() {
		return d;
	}
	
	public double getSolution1() {
		return solution1;
	}
	
	public double getSolution2() {
		return solution2;
	}
	
	public double getSmallest() {
		if (solution1 < solution2) {
			return solution1;
		} else {
			return solution2;
		}
	}
}


