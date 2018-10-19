
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
        }
    }
}
