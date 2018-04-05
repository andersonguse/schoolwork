/**
 * Class: CIST 2372 Java II
 * Quarter: Fall 2017
 * Instructor: Dave Busse
 * Description: Unit 04 Lab
 * Date: Due October 9, 2017
 * @author Anderson Guse
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 *  1. That I have completed the programming assignment independently.
 *  2. I have not copied the code from a student or any source.
 *  3. I have not given my code to any student.
 *
 */
import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Unit04Prog01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner( System.in );
        java.io.File file = new java.io.File("scores.txt");
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            output.print("200 ");
            output.print("300 ");
            output.print("500 ");
            output.print("100 ");
            output.print("100 ");
        }
        System.out.println("Please enter the name of the scores file: ");
        String fileName = scanner.nextLine();
        java.util.Scanner input = new java.util.Scanner(file);
        if (file.getName().equals(fileName)) {
            double total = 0;
            while(input.hasNext()){
                total += input.nextDouble();
            }
            System.out.println("Total is " + total);
        }
        else{
            System.out.println("Sorry, file " + fileName + " not found.");
        }
    }    
}
