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
 */
 public class Unit06_Prog1{
	public static void main(String[] args){
	
	Person myPerson = new Person();
	myPerson.setName("Jake Eisenhower");
	
	Student myStudent = new Student();
	myStudent.setName("Carlos Rodriguez");
	
	Employee myEmployee = new Employee();
	myEmployee.setName("Kenneth Cook");
	
	Faculty myFaculty = new Faculty();
	myFaculty.setName("Albert Lopez");
	
	Staff myStaff = new Staff();
	myStaff.setName("Kenshawn Lewis");
		
	System.out.println(myPerson.toString());
	System.out.println(myStudent.toString());
	System.out.println(myEmployee.toString());
	System.out.println(myFaculty.toString());
	System.out.println(myStaff.toString());
	}
 }