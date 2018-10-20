

/**
 * Taylor Ziegler
 * Period 7
 * parksides fibonacci
 * 10/19/18
 */
import java.util.Scanner;

public class ziegler_taylor_parksides_fibonacci
{
    public static void main(String [] args) {      
        Scanner scan = new Scanner(System.in);
        System.out.println("Size? ");
        int n = scan.nextInt();
        System.out.println("Seed? ");
        int s = scan.nextInt();
        int x = s;
        
        if ((s < 1) || (s > 9)) {
            System.out.println("Not an acceptable seed");
        }
        
        // prints out spaces before the numbers in each row
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row*2; spaces++) {
                System.out.print(" ");
            }
            x = s;
            
            // calculates and prints out numbers with a space between each number
            for (int col = 0; col < n - row; col++) {
                System.out.print(((x - 1) % 9) + 1);
                if (col != (n - row - 1)) {
                    System.out.print(" ");
                    x += row + col + 1;
                }
            }
            s += row + 2;
            System.out.println("");
        }
        
        
        
        
    }
}
