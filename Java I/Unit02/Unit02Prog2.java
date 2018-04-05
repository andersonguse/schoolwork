/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Sum of ten user entered numbers
 * Due: 6/20/17
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
 
 import java.util.Scanner;
 
 public class Unit02Prog2 {
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 int num;				 
		 int cnt = 1;
		 int sum = 0;
		 		
		while (cnt <= 10) {		
			System.out.println("Please enter a number: ");		
			num = input.nextInt();
			sum += num;
			cnt += 1;
		}
		System.out.println("The sum of the ten numbers you entered is: " + sum);
	 }
 }
	 