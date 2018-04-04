/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Unit 06 part 1
 * Due: July 18, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */public class Student extends Person{
	
	private String classStatus;
	
	public Student(){
	}
	Student(String classStatus){
		this.classStatus = classStatus;
	}	
	public void setClassStatus(String classStatus){
		this.classStatus = classStatus;
	}
	public String getClassStatus(){
		return classStatus;
	}
	
	@Override
	public String toString(){
		return "Classname = Student, name = " + getName();
	}
}