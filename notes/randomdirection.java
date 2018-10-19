
/**
 * Write a description of class randomdirection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Random;

public class randomdirection {
    public static void main(String [] args) {
        Random generator = new Random();
        int [] directions = {0, 90, 180, 270};
        StandardPen pen = new StandardPen();
        for (int i = 0; i < 1000; i++) {
            pen.move(10);
            pen.setDirection(directions[generator.nextInt(4)]);
        }
    }
}