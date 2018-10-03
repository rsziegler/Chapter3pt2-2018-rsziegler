

/**
 * Write a description of class PairShare2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class PairShare2
{
    public static void main (String [] args)
        {
             Scanner scan = new Scanner(System.in);
             int number, highest, lowest, range = 0, count;
             
             System.out.print("Enter a number: ");
             number = scan.nextInt();
             lowest = number;
             highest = number;
             
             count = 0;
             while(count < 10)
             {
                 System.out.print("Enter a number: ");
                 number = scan.nextInt();
                 if (number < lowest)
                    lowest = number;
                 else if (number > highest)
                    highest = number;
                 count += 1;
                }
             range = highest - lowest;
             System.out.println(highest);
             System.out.println(lowest);
             System.out.println(range);
        
        }
        
}
