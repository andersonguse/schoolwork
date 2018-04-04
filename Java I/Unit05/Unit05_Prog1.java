/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 05 Program 1
 * Due: July 11, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
 public class Unit05_Prog1 {
	public static void main(String[] args) {
	
		String s1 = (args[0]);
		boolean isLowerCase = false;
		int numOfLowercase = 0;
		
		for (int i = 0; i < s1.length(); i++){
			char c1 = s1.charAt(i);
			if(c1 >= 'a' && c1 <= 'z'){
				isLowerCase = true;
				numOfLowercase++;
			}
			
		}
		System.out.println("The number of lowercase letters is " + numOfLowercase);
	}
}