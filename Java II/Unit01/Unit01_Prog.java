/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 01 Lab
 * Date: Due September 3rd, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
import java.util.*;
public class Unit01_Prog {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int myInt = 0;
      ArrayList<Integer> myList = new ArrayList();
        while (myInt != -1){
          System.out.println("Enter a number (-1 to end): ");
          myInt = input.nextInt();
          if(myInt != -1){
            myList.add(myInt);
          }
          else {
            break;
          }
        }
      Collections.sort(myList);
      System.out.println("Here is the list of numbers: " + myList.toString());
      System.out.println("Here is the minimum value: " + Collections.min(myList));
      System.out.println("Here is the maximum value: " + Collections.max(myList));
    }
}