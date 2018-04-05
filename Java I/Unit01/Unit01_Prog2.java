/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Convert feet to meters
 * Due: 6/13/2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
 
import java.util.Scanner;

public class Unit01_Prog2 {
	public static void main(String[] args) {
		double feet; // Declare number of feet
		double meters; // Declare number of meters
				
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter amount of feet: ");
		feet = input.nextDouble();
								
		//Compute number of meters
		meters = feet * 0.305;
		
		//Display results
		System.out.println("The amount of meters for " + feet + " feet is " + meters + " meters.");
	}
}	