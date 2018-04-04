/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Convert Celsius to Fahrenheit
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

public class Unit01_Prog1 {
	public static void main(String[] args) {
		double celsius; // Declare celsius
		double fahrenheit; // Declare fahrenheit
				
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter celsius: ");
		celsius = input.nextDouble();
								
		//Compute fahrenheit
		fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		//Display results
		System.out.println("The fahrenheit for " + celsius + " celsius is " + fahrenheit + " fahrenheit.");
	}
}		