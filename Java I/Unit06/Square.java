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
 public class Square extends GeometricObject implements Colorable{
	 
	private double side;
	 
	public Square(){
	 }
	Square(double side){
		this.side = side;
	 }
	public void setSide(double side){
		this.side = side;
	}
	public double getSide(){
		return side;
	}
	public double getArea(){
		return side * side;
	}
	public double getPerimeter(){
		return side * 4;
	}
	@Override
	public String howToColor(){
		return "Color all four sides.";
	}
 }