/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 03 Prog 1
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
 
 public class Unit03Prog1 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//prompt user for input		
		
		System.out.println("Please enter two characters: ");
		char c1 = input.next().charAt(0);
		char c2 = input.next().charAt(0);
		
		//print out the characters
		printMethod(c1, c2);
	}	
		//create a method 
		public static char printMethod(char c1, char c2) {
			int cnt = 0;	
			for (char i = c1; c1 <= c2; c1++) {
				if (cnt % 10 == 0)
					System.out.println();
			System.out.print(c1 + " ");
			cnt++;
			}
			return c1;
		}	
 }
 