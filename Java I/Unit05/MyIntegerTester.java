/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: MyIntegerTester class
 * Due: July 11, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
public class MyIntegerTester {
	public static void main(String[] args) {
	
	char[] myArray = new char[]{'3', '5', '3', '9'};
	String s1 = "3539";
	
	MyInteger n1 = new MyInteger(5);
	MyInteger n2 = new MyInteger(7);
	
	System.out.println("Tests use MyInteger n1 object constructed with MyInteger("+n1.getValue()+")");
	System.out.println("Testing equals(int), n1 and 6: " + n1.equals(6));
	System.out.println("Testing equals(MyInteger), n1 and n2 = "+n2.getValue()+": " + n1.equals(n2));
	System.out.println("Testing isEven(), n1 which is " + n1.getValue()+", is even?" + n1.isEven());
	System.out.println("Testing isOdd(), n1 which is " + n1.getValue()+", is odd?" + n1.isOdd());
	System.out.println("Testing static isPrime(), n1 which is " + n1.getValue()+", is prime?" + MyInteger.isPrime(n1));
	System.out.println("Testing instance isPrime(), " + n1.getValue() + " is prime?" + n1.isPrime());
	System.out.println("Next two tests use char[] and String data of 3539");
	System.out.println("Testing parseInt(char[]): " + MyInteger.parseInt(myArray));
	System.out.println("Testing parseInt(String) Passing: " + MyInteger.parseInt(s1));
	}
}