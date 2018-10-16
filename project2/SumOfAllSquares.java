package HW2;

public class SumOfAllSquares {
	
	public static void main(String[] args) {
		int squaresSum = 0;
		
		for (int i = 1 ; i < 101; i++){
			
				squaresSum += i*i;
		}
		System.out.println("This is the sum of all squares: " + squaresSum);
	}

}
