package HW2;

import java.util.Random;

public class BuffonNeedleGenerator {
	
	private float yLow; 	//y low is between 0-2
	private float angle;	//angle is between 0-180
	private double yHigh; 	//yHigh = yLow +sin(angle);
	private int hits;
	private int tries;

	//the needle is a hit if at least yHigh = 2
	//Stop after 10,000 tries
	//Print quotient tries/hits
	
	//default constructor
	BuffonNeedleGenerator(){
		yLow = 1;
		angle = 0;
	}
	
	//constructor that accepts 2 arguments
	BuffonNeedleGenerator(int initYLow, int initAngle){
		yLow = initYLow;
		angle = initAngle;
	}
	
	Random r = new Random();
	
	//generate random numbers
	public float generateYLow() {
		return (r.nextFloat()+r.nextInt(2)); //randomized between 0.00-1.00 + randomized 1 or 1.999999
	}
	
	public float generateAngle() {
		return (r.nextFloat()+r.nextInt(180)); //randomized between 0.00-1.00 + randomized 0-179.9999
	}
	
	//accessor methods
	public float getYLow() {
		return yLow;
	}
	
	public float getAngle() {
		return angle;
	}
	
	//getYHigh for debugging purposes
	public double getYHigh() {
		return yHigh;
	}
	
	public int getHits() {
		return hits;
	}
	
	public int getTries() {
		return tries;
	}
	
	//mutator methods
	public void addHit() {
		hits += 1;
	}
	
	public void addTry() {
		tries +=1;
	}
	
	public double solveYHigh(float passedYLow, float passedAngle) {
		
		yHigh = (passedYLow + Math.sin(passedAngle*(Math.PI/180)));
		return yHigh;
		
	}
	
	public void setBuffonNeedleGenerator(float passedYLow, float passedAngle) {
		yLow = passedYLow;
		angle = passedAngle;
	}
}
