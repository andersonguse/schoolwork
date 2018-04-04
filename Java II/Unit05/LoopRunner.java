/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 05 Lab
 * Date: Due October 22, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
package unit05;
public class LoopRunner extends Unit05_LabTester implements Runnable {  
    private char c1 = 'a';
    private int num = 0;   
    public LoopRunner(char c1, int num) {
        this.c1 = c1;
        this.num = num;       
    } 
    @Override
    public void run(){
       for(int i = 0; i < num; i++){
            System.out.println(c1);
        }    
    } 
}