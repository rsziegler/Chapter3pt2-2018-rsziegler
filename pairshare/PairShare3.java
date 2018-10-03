

/**
 * Write a description of class PairShare3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class PairShare3
{
    public static void main (String [] args)
        {
            Scanner scan = new Scanner(System.in);
            int count = 0;
            String quote, answer;
            
            quote = "We will keep the quote pg";
            System.out.print("Enter a character: ");
            answer = scan.next();
            
            for (int i = 0; i < quote.length(); i++)
            {
                if (quote.charAt(i)== answer.charAt(0))
                    count += 1;
        }
            System.out.println(count);
}
}