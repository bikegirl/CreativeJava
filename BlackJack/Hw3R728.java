package HW3;

   /*
	* 		int[][] values = new int[ROWS][COLUMNS];
	*		• Fill all entries with 0.
	*		• Fill elements alternately with 0s and 1s in a checkerboard pattern.
	*		• Fill only the elements in the top and bottom rows with zeroes.
	*		• Compute the sum of all elements.
	*		• Print the array in tabular form.
	*	
    */

public class Hw3R728 {
	
	private static final int ROWS = 3;
	private static final int COLUMNS = 5;

	public static void main(String[] args) {
		
		int[][] values = new int[ROWS][COLUMNS];
		
		//Fill all entries with 0.
		for (int i = 0; i < values.length; i++){
		
			for (int j = 0; j < values[0].length; j++) {
				
				values[i][j] = 0;
			}
		}
		
		//print
		for (int i = 0; i < values.length; i++){
			for (int j = 0; j < values[0].length; j++){
				System.out.print(values[i][j]);
			}
		System.out.println("");
		}
		
		System.out.println("");
		
		//Fill elements alternately with 0s and 1s in a checkerboard pattern.
		for (int i = 0; i < values.length; i++){
			
			if (i % 2 ==0 ) {
		
				for (int j = 0; j < values[0].length; j++) {
					
					if (j % 2 == 0) {
						values[i][j] = 0;
					} else {
						values[i][j] = 1;
					}
				}
				
			} else {
				for (int j = 0; j < values[0].length; j++) {
					
					if (j % 2 == 0) {
						values[i][j] = 1;
					} else {
						values[i][j] = 0;
					}
				}	
			}
		}
		
		//print
		for (int i = 0; i < values.length; i++){
			for (int j = 0; j < values[0].length; j++){
				System.out.print(values[i][j]);
			}
		System.out.println("");
		}
		
		System.out.println("");
		
		//Fill only the elements in the top and bottom rows with zeroes.
				for (int i = 0; i < values.length; i++){
					
					if (i == 0) {
				
						for (int j = 0; j < values[0].length; j++) {
							
							values[i][j] = 0;
						}
					} else if (i == (values.length-1)) {
						
						for (int j = 0; j < values[0].length; j++) {
							values[i][j] = 0;
						}
					} else {
						
						for (int j = 0; j < values[0].length; j++) {
							values[i][j] = 1;
						}
					}
				}
				
		//print
		for (int i = 0; i < values.length; i++){
			for (int j = 0; j < values[0].length; j++){
				System.out.print(values[i][j]);
			}
		System.out.println("");
		}
		
		System.out.println("");

		//Compute the sum of all elements.
		//create newMatrix for this example.
		int matrixTotal = 0;
		int[][] newMatrix = {
								{1,2,3},
								{4,5,6},
								{7,8,9},				
							};
		
		//sum the elements
		for (int i = 0; i < newMatrix.length; i++){
			for (int j = 0; j < newMatrix[0].length; j++){
				matrixTotal = matrixTotal + newMatrix[i][j];
			}
		}
		
		//print matrix total
		System.out.println("Print matrixTotal: " + matrixTotal);
		
		System.out.println("");
		
		//print newMatrix array in tabular form (which is what I had been doing
		//because it was the only way I new how to make sure I was doing it 
		//correctly;
		for (int i = 0; i < newMatrix.length; i++){
			for (int j = 0; j < newMatrix[0].length; j++){
				System.out.print(newMatrix[i][j]);
			}
		System.out.println("");
		}
	
	}
}

