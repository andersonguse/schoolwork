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
public class Unit05_LabTester {
    public static void main(String[] args) {        
        LoopRunner loopRunner1 = new LoopRunner('a', 10);
        Thread thread1 = new Thread(loopRunner1);         
        LoopRunner loopRunner2 = new LoopRunner('b', 15);
        Thread thread2 = new Thread(loopRunner2);       
        LoopRunner loopRunner3 = new LoopRunner('c', 20);
        Thread thread3 = new Thread(loopRunner3);        
        LoopRunner loopRunner4 = new LoopRunner('d', 25);
        Thread thread4 = new Thread(loopRunner4); 
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("Main thread here.");
    }    
}
