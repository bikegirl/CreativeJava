package HW2;

import java.util.Scanner;

public class FactorGenerator {
	
	private int myNum;
	private int factor;
	
	//default constructor
	FactorGenerator(){
		myNum = 150;
		factor = 1;
	}
	
	//2nd constructor accepting one argument
	FactorGenerator(int passedNum){
		myNum = passedNum;
		factor = 1;
	}
	
	//accessor methods
	public int getNum() {
		return myNum;
	}
	
	public int getFactor() {

		return factor;
	}
	
	//go to next factor when called
	public void nextFactor() {
		factor++;
	}
	
	public boolean hasMoreFactors() {
		if (myNum % factor == 0) {
			return true;
		} else {
			return false;
		}
	}

}
