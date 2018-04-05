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
 class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	public Faculty(){
	}
	Faculty(String officeHours, String rank){
		this.officeHours = officeHours;
		this.rank =rank;
	}
	public void setOfficeHours(String officeHours){
		this.officeHours = officeHours;
	}
	public void setRank(String rank){
		this.rank = rank;
	}
	public String getOfficeHours(){
		return officeHours;
	}
	public String getRank(){
		return rank;
	}
	public String toString(){
		return "Classname = Faculty, name = " + getName();
	}
}