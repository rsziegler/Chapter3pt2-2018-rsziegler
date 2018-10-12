

/**
 * Write a description of class speeches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class speeches
{
    public static void main(String [] args) throws IOException {
        Scanner scanfile = new Scanner(new File("data\\tjefferson.txt"));
        String line;
        String date = scanfile.nextLine();
        String name = scanfile.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        int people = 0, government = 0, united = 0, our = 0;
        String[] split = scanfile.split(" ");
        
        while (scanfile.hasNext()) {
            line = scanfile.nextLine();
            for (int i = 0; i < line.length()-6; i++) {
                if (line.substring(i, i+6).equalsIgnoreCase("people")) {
                    people++;
                }
                else if (line.substring(i, i+6).equalsIgnoreCase("united")) {
                    united++;
                }
            }
            for (int i = 0; i < line.length()-10; i++) {
                if (line.substring(i, i+10).equalsIgnoreCase("government")) {
                    government++;
                }
            }
            for (int i = 0; i < line.length()-3; i++) {
                if (line.substring(i, i+3).equalsIgnoreCase("our")) {
                    our++;
                }
            }
        }
        System.out.println("People: " + people);
        System.out.println("Government: " + government);
        System.out.println("United: " + united);
        System.out.println("Our: " + our);
    }
}
