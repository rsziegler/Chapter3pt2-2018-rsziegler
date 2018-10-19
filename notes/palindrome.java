
<<<<<<< HEAD

/**
 * Write a description of class palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class palindrome
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your string: ");
        scan.useDelimiter("");
        String palindrome = scan.next();
        
        boolean runagain = true;
        int i = 0;
        char thischar;
        char invchar;
        while (runagain == true) {
            thischar = palindrome.charAt(i);
            invchar = palindrome.charAt(palindrome.length()-(i+1));
            if (i == palindrome.length()-i) {
                System.out.println("palindrome");
                runagain = false;
            }
            else if ((thischar == invchar) && (i < palindrome.length())) {
                runagain = true;
            }
            else {
                System.out.println("not a palindrome");
                runagain = false;
            }
            i++;
=======
/**
 * Write a description of class palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class palindrome {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter palindrome to test: ");
        String palindrome = scan.nextLine();
        palindrome = palindrome.replaceAll(" ","");
        palindrome = palindrome.toLowerCase();
        boolean stillpalindrome = true;
        
        for(int i = 0; (i < palindrome.length()) && stillpalindrome; i++) {
            if(!(palindrome.charAt(i) == palindrome.charAt(palindrome.length()-(i+1)))) {
                System.out.println("Not a palindrome");
                stillpalindrome = false;
            }
        }
        if(stillpalindrome == true) {
            System.out.println("It is a palindrome");
>>>>>>> e4b9235f2ebc8627f09002177d72fc863ff29330
        }
    }
}
