

/**
 * Write a description of class PairShare1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class PairShare1
{
    public static void main (String [] args)
        {
             Scanner scan = new Scanner(System.in);
             int number, sum = 0;
             
             System.out.print("Enter a number: ");
             number = scan.nextInt();
             
             while(number != -9999)
             {
                 System.out.print("Enter a number: ");
                 number = scan.nextInt();
                 sum += number;
                }
             sum += 9999;
            System.out.println(sum);
}
}