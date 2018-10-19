
/**
 * draws a rose
 */
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class polarRose {
    public static void main(String [] args) {
        StandardPen pen = new StandardPen();
        pen.up();
        double i = 0;
        double x = (Math.cos(2*i) * Math.cos(i))*100;
        double y = (Math.cos(2*i) * Math.sin(i))*100;
        pen.move(x, y);
        pen.down();
        for (i = Math.PI/100; i < (2*(Math.PI)); i = i+((Math.PI)/100)) {
            // r = cos (2Ɵ)
            // x = r * cos (Ɵ), y = r * sin(Ɵ)
            x = (Math.cos(2*i) * Math.cos(i))*100;
            y = (Math.cos(2*i) * Math.sin(i))*100;
            pen.move(x, y);
            
        }
    }
}
