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
public class GeometricObject {
	private String color;
	private boolean filled;
	private String creationDate;

	public GeometricObject(){
	}
	GeometricObject(String color, boolean filled, String creationDate){
		this.color = color;
		this.filled = filled;
		this.creationDate = creationDate;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public void setCreationDate(String creationDate){
		this.creationDate = creationDate;
	}
	public String getColor(){
		return color;
	}
	public boolean getFilled(){
		return filled;
	}
	public String getCreationDate(){
		return creationDate;
	}
}