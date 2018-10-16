package HW1;

/**
 * Implement a class Student. For the purpose of this exercise, 
 * a student has a name and a total quiz score. Supply an appropriate 
 * constructor and methods getName(), addQuiz(int score), getTotalScore(), 
 * and getAverageScore(). To compute the average, you also need to store 
 * the number of quizzes that the student took. Supply a StudentTester class 
 * that tests all methods.  (25 points)
 * @author bikegirl
 *
 */

public class Student {
	
	private String name;
	private double totalScore;
	private double avgScore;
	private int counter;
	
	//Constructor
	Student() {
		
		name = "";
		totalScore = 0;
		avgScore = 0;
		counter = 0;
	}
	
	//2nd Constructor
	Student(String nameAdded) {
		
		name = nameAdded;
		totalScore = 0;
		avgScore = 0;
		counter = 0;
	}
	
	//keeps a tally of how many quizzes have been added and a cumulative total
	public void addQuiz(int score){
		counter++;
		totalScore += score;
	}
	
	//calculates the avg of the quiz scores
	public void calculateAvg(){
		avgScore = totalScore/counter;
	}
	
	//returns the name of the current student being graded
	public String getName() {
		return name;
	}
		
	//returns the total score of the student
	public double getTotalScore(){
		return totalScore;
	}
	
	//returns the total score
	public double getAverageScore(){
		return Math.round(avgScore);
	}

}
