
/**
 * Write a description of class evenodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class evenodd {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scan.next();
        int even = 0, odd = 0, zero = 0;
        
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            if (input.charAt(i) == '0') {
                zero++;
            }
            else if (((((int) input.charAt(i))%2) == 0)) {
                even++;
            }
            else if (((((int) input.charAt(i))%2) == 1)) {
                odd++;
            }
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
        System.out.println("Zero: " + zero);
        
    }
}
