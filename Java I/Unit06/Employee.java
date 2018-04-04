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
 class Employee extends Person{
	
	private String officeNum;
	private double salary;
	private String dateHired;
	
	public Employee(){
	}
	Employee(String officeNum, double salary, String dateHired){
		this.officeNum = officeNum;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public void setOfficeNum(String officeNum){
		this.officeNum = officeNum;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setDateHired(String dateHired){
		this.dateHired = dateHired;
	}
	public String getOfficeNum(){
		return officeNum;
	}
	public double getSalary(){
		return salary;
	}
	public String getDateHired(){
		return dateHired;
	}
	public String toString(){
		return "Classname = Employee, name = " + getName();
	}
}