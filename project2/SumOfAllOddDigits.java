package HW2;

public class SumOfAllOddDigits {
	
	public static void main(String[] args) {
	
		int myNum = 32587; //so result = 29
		int tempNum;
		int sumOfOddDigits = 0;
//		int tempNum1;
//		int tempNum2;
//		int tempNum3;
		
//		tempNum1 = myNum % 10;
//		tempNum2 = myNum % 100;
//		tempNum3 = tempNum2 / 10;
//		
//		System.out.println(myNum);
//		System.out.println(tempNum1);
//		System.out.println(tempNum2);
//		System.out.println(tempNum3);
		
		while (myNum > 0) {
		    System.out.println(myNum % 10);
			tempNum = myNum % 10;
			System.out.println(" this is tempNum: " + tempNum);
			if (tempNum % 2 != 0) {
				sumOfOddDigits += tempNum;
				System.out.println("Sum: " + sumOfOddDigits);
			}
			myNum = myNum / 10;
		System.out.println(myNum);
		//System.out.println("This is the sum of all odds: " + OddSum);
		}
	System.out.println("This is the sum of all the odd digits: " + sumOfOddDigits);
	}
}


