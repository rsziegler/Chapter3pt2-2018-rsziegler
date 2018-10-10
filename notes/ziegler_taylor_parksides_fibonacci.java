

/**
 * Write a description of class ziegler_taylor_parksides_fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ziegler_taylor_parksides_fibonacci
{
    public static void main(String [] args) {
        int x = 0, y = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("How far would you like to count? (enter a number) ");
        int lim = scan.nextInt();
        lim -= 2;
        System.out.println(x);
        System.out.println(y);
        
        for (int i = 0; i < lim; i += 1) {
            if (i%2 == 0) {
                x = x + y;
                System.out.println(x);
            }
            else {
                y = y + x;
                System.out.println(y);
            }
        }
    }
}
