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
public class Person{
	
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	public Person(){
	}
	Person(String name, String address, String phoneNum, String email){
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	public String getEmail(){
		return email;
	}
	public String toString(){
		return "Classname = Person, name = " + getName();
	}
}
