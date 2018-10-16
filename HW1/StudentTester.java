package HW1;

import java.util.Scanner;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String name = "";
		int currentScore = 1;
		
		System.out.println("Enter the name of the Student: ");
		name = scan1.nextLine();
		
		Student student1 = new Student(name);

		
		while (currentScore != 0) {
			
			System.out.println("Enter quiz score or 0 to quit: ");
			currentScore = scan2.nextInt();
			
			if (currentScore == 0) {
				System.out.println("No more quizzes to Enter.");
				break;
			} else {
				student1.addQuiz(currentScore);	
			}
		}
		
		student1.calculateAvg();
		System.out.println("Total Score for " + student1.getName() + " is: " + student1.getTotalScore());
		System.out.println("Average Score: " + student1.getAverageScore());
	}
		
}
