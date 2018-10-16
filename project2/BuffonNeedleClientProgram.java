package HW2;

public class BuffonNeedleClientProgram {

	public static void main(String[] args) {
		
		BuffonNeedleGenerator needle = new BuffonNeedleGenerator();
		
		int counter = 0;
		while (counter < 10000) {
			needle.setBuffonNeedleGenerator(needle.generateYLow(),needle.generateAngle());
			if (needle.solveYHigh(needle.getYLow(), needle.getAngle()) >= 2 ) {
				//debugging
				//System.out.println("This is YHigh: " + needle.getYHigh() + "\n");
				needle.addHit();
			} 
			needle.addTry();
			counter++;
			//System.out.println("Prints Hits " + needle.getHits());
			//System.out.println("Prints Tries " + needle.getTries() + "\n");
		}
		
		System.out.println("The quotient is: " + (needle.getTries()/needle.getHits()));
	}
}
