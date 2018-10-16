package HW2;

public class SumOfAllOdds {
	
	public static void main(String[] args) {
		
		int OddSum = 0;
		
		for (int i = 1; i < 101; i++){
			if (i % 2 != 0) {
				OddSum += i;
			}
		}
		System.out.println("This is the sum of all odds: " + OddSum);
	}

}
