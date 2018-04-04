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
import java.io.IOException;
import java.io.File;
import java.io.*;
import java.util.Random;

public class Unit04Prog02 {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("CreateData.dat")) {
            Random randomNum = new Random();
            for (int i = 0; i < 100; i++)
            {
                output.write(randomNum.nextInt(999) + 1);
            }
            output.close();
        }
    } 
}
