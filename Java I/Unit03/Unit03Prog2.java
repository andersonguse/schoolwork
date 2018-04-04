/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 03 Prog 2
 * Due: 6/27/17
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
 
 import java.util.Scanner;
 
 public class Unit03Prog2 {
	public static void main(String [] args) {
		
		int[] intArray =  new int [10];
		
		//print values returned from method
		arrayMethod(intArray);
	}
	//assign values to array by user input
	public static void arrayMethod(int[]intArray) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int size = 0;  // keep track the number of distinctive number;
		boolean isInArray = false;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter an integer: "); 
            num = input.nextInt();
	
			//set the flag to false;  
        	isInArray = false;		
        for (int j = 0; j < size; j++) { 
			
               if(intArray[j] == num) {
				isInArray = true;
			   break;
			   }
		}
              if (!isInArray){
               // add num to the array (use size as the index)
              intArray[size] = num;
              //  increment size by 1
			  size++;
			  } 	
		}
		System.out.println("The number of distinct values is " + size);
		for (int i = 0; i < size; i++){ 
				System.out.print(intArray[i] + " ");
		}
	}
}
 