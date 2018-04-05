/**
 * Class: CIST 2371 Introduction to Java
 * Term: Summer 2017
 * Instructor: Jianmin Wang
 * Description: Account object class
 * Due: July 4th, 2017
 * @author Anderson F. Guse
 * @version 1.0
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
public class Account{
	
	private String accNum;
	private String accType;
	private String cardNum;
	private String expDate;
	
	Account() {
	}
	Account(String newAccNum, String newAccType, String newCardNum, String newExpDate) {
	accNum = newAccNum;
	accType = newAccType;
	cardNum = newCardNum;
	expDate = newExpDate;
	}
	public String getAccNum(){
		return accNum;
	}
	public String getAccType(){
		return accType;
	}
	public String getCardNum(){
		return cardNum;
	}
	public String getExpDate(){
		return expDate;
	}
	public void setAccNum(String newAccNum) {
		accNum = newAccNum;
	}
	public void setAccType(String newAccType) {
		accType = newAccType;
	}
	public void setCardNum(String newCardNum) {
		cardNum = newCardNum;
	}
	public void setExpDate(String newExpDate) {
		expDate = newExpDate;
	}	
}