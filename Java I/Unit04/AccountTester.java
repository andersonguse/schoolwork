/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Account tester for account class
 * Due: July 4th, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
import java.util.Scanner;

public class AccountTester {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your account number: ");
		String accNum = input.nextLine();
		System.out.println("Please enter the type of your account: ");
		String accType = input.nextLine();
		System.out.println("Please enter your card number: ");
		String cardNum = input.nextLine();
		System.out.println("Please enter the expiration date on your card: ");
		String expDate = input.nextLine();
		
		Account myAccount = new Account(accNum, accType, cardNum, expDate);
		
		System.out.println("Your account number is " + myAccount.accNum);
		System.out.println("The type of your account is " + myAccount.accType);
		System.out.println("Your card number is " + myAccount.cardNum);
		System.out.println("The expiration date on your card is " + myAccount.expDate);
		
		System.out.println("Please enter your account number: ");
		accNum = input.nextLine();
		System.out.println("Please enter the type of your account: ");
		accType = input.nextLine();
		System.out.println("Please enter your card number: ");
		cardNum = input.nextLine();
		System.out.println("Please enter the expiration date on your card: ");
		expDate = input.nextLine();
		
		myAccount.setAccNum(accNum);
		myAccount.setAccType(accType);
		myAccount.setCardNum(cardNum);
		myAccount.setExpDate(expDate);		
		
		System.out.println("Your account number is " + myAccount.getAccNum());
		System.out.println("The type of your account is " + myAccount.getAccType());
		System.out.println("Your card number is " + myAccount.getCardNum());
		System.out.println("The expiration date on your card is " + myAccount.getExpDate());		
	}
}