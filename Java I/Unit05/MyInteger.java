/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: MyInteger class
 * Due: July 11, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
 public class MyInteger{
	
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public boolean isEven(){
		boolean isEven = false;
		if (value % 2 == 0)
			isEven = true;
		return isEven;
	}
	public boolean isOdd(){
		boolean isOdd = false;
		if (value % 2 != 0)
			isOdd = true;
		return isOdd;
	}
	public boolean isPrime(){
		boolean isPrime = true;		
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static boolean isEven(int value){
		boolean isEven = false;
		if (value % 2 == 0)
			isEven = true;
		return isEven;
	}
	public static boolean isOdd(int value){
		boolean isOdd = false;
		if (value % 2 != 0)
			isOdd = true;
		return isOdd;
	}
	public static boolean isPrime(int value){
		boolean isPrime = true;		
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static boolean isEven(MyInteger n1){
		return n1.isEven();
	}
	public static boolean isOdd(MyInteger n1){
		return n1.isOdd();
	}
	public static boolean isPrime(MyInteger n1){
		return n1.isPrime();
	}
	public boolean equals(int newValue){
		boolean isEqual = false;
		if(value == newValue)
			isEqual = true;
		return isEqual;
	}
	public boolean equals(MyInteger n2){
		boolean isEqual = false;
		if (n2.getValue() == this.getValue())
		return true;
		return false;
	}
	public static int parseInt(char[] myArray){
		return Integer.parseInt(new String(myArray));
	}
	public static int parseInt(String s1){
		return Integer.parseInt(s1);
	}
}


















