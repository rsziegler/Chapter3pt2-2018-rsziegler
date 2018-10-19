
/**
 * Write a description of class spiral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class spiral {
    public static void main(String [] args) {
        int div = 0;
        StandardPen pen = new StandardPen();
        for (int i = 0; i < 1000; i += 5) {
            pen.move(i);
            div = i%4;
            if (div == 0) {
                pen.setDirection(0);
            }
            else if (div == 1) {
                pen.setDirection(90);
            }
            else if (div == 2) {
                pen.setDirection(180);
            }
            else {
                pen.setDirection(270);
            }
        }
    }
}
