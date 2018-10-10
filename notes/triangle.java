

/**
 * Write a description of class triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class triangle
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < (10-i); j--) {
                System.out.print(" ");
            }
            for(int j = 10; j > i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
