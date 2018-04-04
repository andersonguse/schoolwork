/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Daily Gazette Newspaper
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
 
 public class Unit02Prog1 {
	 public static void main(String [] args) {
		 
		Scanner input = new Scanner(System.in);
		 
		 //Declare variables customer name, ad category, and number of words
		 System.out.println("Please enter a name for the customer: ");
		 String custName = input.nextLine();
		 System.out.println("Please enter the name for the ad category: ");
		 String adCategory = input.nextLine();
		 System.out.println("Please enter the number of words in your ad: ");
		 int wordCnt = input.nextInt();
		 double price = 0.00;
		 
		 if (wordCnt <= 50) 
			 price = wordCnt * 0.10;
			else {
				price = ((wordCnt - 50) * 0.08) + 5.00;
			}
		
		 System.out.println("The customer name is: " + custName);
		 System.out.println("The ad is being placed in category: " + adCategory);
		 System.out.println("The word count for the ad is " + wordCnt + " and the price for the ad is $" + price);					 
	 }
 }