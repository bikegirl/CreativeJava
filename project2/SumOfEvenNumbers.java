package HW2;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		int evenSum = 0;
		
		for (int i = 2; i < 101; i++){
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("This is the sum of all evens: " + evenSum);
	}

}
