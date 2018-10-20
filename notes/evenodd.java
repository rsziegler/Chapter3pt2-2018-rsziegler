/**
 * Taylor Ziegler
 * Period 7
 * even odd
 * 10/19/18
 */
import java.util.Scanner;

public class evenodd {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scan.next();
        int even = 0, odd = 0, zero = 0;
        
        // for each char in the input, check if it is even, odd, or zero
        for (int i = 0; i < input.length(); i++) {
            // check to see if the char is even, odd, or zero
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

/*
Enter your string: 
38843759800
Odd: 5
Even: 4
Zero: 2

Enter your string: 
42
Odd: 0
Even: 2
Zero: 0

Enter your string: 
42534623423454300
Odd: 6
Even: 9
Zero: 2
 */
