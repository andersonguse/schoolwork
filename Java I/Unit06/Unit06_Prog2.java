/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 06 part 2
 * Due: July 18, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
 public class Unit06_Prog2 {
	public static void main(String[] args){
		
		Square mySquare = new Square(5.0);
		
		mySquare.setColor("Red");
		mySquare.setFilled(true);

		System.out.println(mySquare.howToColor());
		System.out.println("The area of the square is " + mySquare.getArea());
		System.out.println("The perimeter of the square is " + mySquare.getPerimeter());
		System.out.println("The color of the square is " + mySquare.getColor());
		System.out.println("Is the square filled? " + mySquare.getFilled());
		
	}
 }