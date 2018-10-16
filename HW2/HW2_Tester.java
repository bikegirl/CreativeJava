package HW2;

public class HW2_Tester {
	
	public static void main(String[] args) {
		
		//what do these print out?
		//for (int i = 1; i < 10; i++) { System.out.print(i + " "); } 
		//for (int i = 1; i < 10; i += 2) { System.out.print(i + " "); }
		//for (int i = 10; i > 1; i--) { System.out.print(i + " "); }
		//for (int i = 0; i < 10; i++) { System.out.print(i + " "); } 
		//for (int i = 1; i < 10; i = i * 2) { System.out.print(i + " "); }
		//for (int i = 1; i < 10; i++) { if (i % 2 == 0) { System.out.print(i + " "); } }
		
		
		//re-write this for loop into a while loop
		 int s = 0; 
		 for (int i = 1; i <= 10; i++) {
		     s = s + i;
		     System.out.println(s + " ");
		  }
		 
		//re-write this for loop into a while loop
		 int d = 0;
		 int j = 0;
		 while (j < 11) {
			 d = d + j;
		     System.out.println(d + " ");
		     j++;
		 }
	}
}
