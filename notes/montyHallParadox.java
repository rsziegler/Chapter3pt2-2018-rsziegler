

/**
 * Write a description of class montyHallParadox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class montyHallParadox
{
    public static void main(String[] args) {
        Random generator = new Random();
        int carDoor, switchdoor = 0, elim = 0, numstay = 0, choice = 0, numswitch = 0;
        for(int i = 0; i < 10000; i++) {
            carDoor = generator.nextInt(2);
            choice = generator.nextInt(2);
            elim = 0;
            switchdoor = 0;
            while ((elim == choice) || (elim == carDoor)) {
                elim++;
            }
            while ((switchdoor == elim) || (switchdoor == choice)) {
                switchdoor++;
            }
            if (carDoor == choice) {
                numstay++;
            }
            if (carDoor == switchdoor){
                numswitch++;
            }
        }
        System.out.println(numstay);
        System.out.println(numswitch);
    }
}
