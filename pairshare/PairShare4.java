

/**
 * Write a description of class PairShare4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class PairShare4
{
    public static void main (String [] args)
        {
            Scanner scan = new Scanner(System.in);
            String quote;
            int count = 0;
            
            System.out.print("Enter a sentence: ");
            quote = scan.nextLine();
            
            for (int i = (quote.length()-1); i >= 0; i--)
            {
                System.out.print(quote.charAt(i));
        }
        System.out.print("\n");
            for (int i = 0; i < quote.length(); i++)
            {
                if (quote.charAt(i) < 97 && quote.charAt(i) != 32)
                    System.out.print(quote.charAt(i));
        }
        System.out.print("\n");
            for (int i = 0; i < quote.length(); i++)
            {
                if (quote.toUpperCase().charAt(i) == 65 || quote.toUpperCase().charAt(i) == 69 || 
                    quote.toUpperCase().charAt(i) == 73|| quote.toUpperCase().charAt(i) == 79 || 
                    quote.toUpperCase().charAt(i) == 85)
                    System.out.print("_");
                else
                    System.out.print(quote.charAt(i));
        }
        System.out.print("\n");
            for (int i = 0; i < quote.length(); i++)
            {
                if (quote.toUpperCase().charAt(i) == 65 || quote.toUpperCase().charAt(i) == 69 || 
                    quote.toUpperCase().charAt(i) == 73|| quote.toUpperCase().charAt(i) == 79 || 
                    quote.toUpperCase().charAt(i) == 85)
                    count++;
        }
        System.out.println(count);
}
}
