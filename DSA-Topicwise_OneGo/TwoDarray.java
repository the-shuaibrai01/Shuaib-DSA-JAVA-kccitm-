import java.util.Arrays;
import java.util.Scanner;
public class TwoDarray{
	public static void main(String[] args) {
		
		System.out.println("2D-Array");
		//Qno.1: input row and col from user and create 2D array of that size and take input from user and print the array in matrix form.
		//structure iof 2d array 
		System.out.println("enter row and col");
		Scanner Sc = new Scanner (System.in);
		int row =  Sc.nextInt();
		int col =  Sc.nextInt();
		
		int [][] Number = new int [row ][col];
		
		//input from user 
		for (int i = 0 ; i< row ; i++){
		    for (int j = 0 ; j< col; j++){
		        Number[i][j] = Sc.nextInt();
		    
		     }
      	}
      	
      	//output 
      	for (int i = 0 ; i< row ; i++){
		    for (int j = 0 ; j< col; j++){
		        System.out.print(Number[i][j] + " ");
		    }
      	}

		//2D-array in matrix form:
		System.out.println("Array in matrix form:");
        for (int i = 0; i < Number.length; i++) {
            for (int j = 0; j < Number[i].length; j++) {
                System.out.print(Number[i][j] + " ");
            }
            System.out.println(); // Moves to the next line after each row finishes
        }
      	
      	System.out.println();
        System.out.println("Array is " + Arrays.deepToString(Number));

		//Qno.1 : print all the values in 0th row of 2D-array
		System.out.println("print all elemnt of 0th row : ");
        for (int j = 0; j < Number[0].length; j++) {
            System.out.println(Number[0][j]);
        }
        System.out.println();

		//Qno.2 : print all the values in 0th col of 2D-array
		 System.out.println("Elements in the 0th column:");
        for (int i = 0; i < Number.length; i++) {
            System.out.println(Number[i][0]);
        }

      	
	}
}