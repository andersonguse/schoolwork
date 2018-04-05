/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 02 Lab
 * Date: Due September 10th, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package unit02;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
    }
    public InsufficientFundsException(String message){
      super(message);  
    }
}
