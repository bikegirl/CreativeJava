package HW3;

public class Theory {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		
		int total = 0;
		
		for (int i = 1; i < 5; i++) { a[i] = a[9 - i]; }
		//System.out.println("This is total: " + a);
		
		for(int i=0;i<a.length;i++) {System.out.print(a[i] + " ");
	}
		
	}

}
