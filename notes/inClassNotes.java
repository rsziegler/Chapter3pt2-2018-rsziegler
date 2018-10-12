

/**
 * Notes
 * Taylor Ziegler
 */
import java.util.Scanner;
import java.io.*;

public class inClassNotes
{
    enum Days{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
    public static void main(String[] args) throws IOException // required for File IO
    {
        /*
        // for each loop - to use with iterators
        for (Days today : Days.values()) {
            System.out.println(today);
        }
        
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int n : numbers) {
            System.out.println(n);
        }
        
        String phrase = "great works are preformed not by strength but by preseverance";
        // only one data type can be defined in the head
        //       0            1               3
        for (int i = 0; i < phrase.length(); i++) { // 2
            System.out.println(phrase.charAt(i));
        }
        
        
        for (int i = 0, j = 10; i < phrase.length() && j > 0; i++) { // 2
            System.out.print(phrase.charAt(i));
            System.out.println(phrase.charAt(j--)); // --j evaluates first but j-- evaluates second
        }
        
        for (;;){} // infinite loop
        
        // for each will not work for String
        //for (String letter : word) {
        //    System.out.println(letter);
        //}
        
        /* ---- while and do while ----
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number");
        int test = keyboard.nextInt();
        
        while ((test != -9999) && (test != 2))
        {
            if (test == 2){
                System.out.println("correct");
            }
            else {
                System.out.println("try again");
            }
            test = keyboard.nextInt();
        }
        
        System.out.println("Guess a number");
        
        do
        {
            if (test == 2){
                System.out.println("correct");
            }
            else {
                System.out.println("try again");
            }
            test = keyboard.nextInt();
        }
        while (test != -9999);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        */
       
       /*
       for (int i = 1; i <= 100; i++) {
           if (i%15 == 0) {
               System.out.println("Fizzbuzz");
           }
           else if (i%3 == 0) {
               System.out.println("Fizz");
           }
           else if (i%5 == 0) {
               System.out.println("Buzz");
           }
           else {
               System.out.println(i);
           }
        }
       */
       // ---- iterators ----
       // Scanner is an iterator - hasNext() and next() methods
       
       Scanner words = new Scanner("star lord batman pikachu trump spiderman homer simpson");
       
       while(words.hasNext()) { // does this contain more data
           System.out.print(words.next());
       }
       
       // the path of your file
       // absolute path
       // Scanner scanfile = new Scanner(new File("C:\Users\rsziegler\Desktop\APCS\chapter4-2018-rsziegler\notes\data\Debate.txt");
       
       // must be in the same folder
       Scanner scanfile = new Scanner(new File("somedata\\people.txt"));
       String name, address, phone;
       while(scanfile.hasNext()) {
           name = scanfile.next();
           address = scanfile.next();
           phone = scanfile.next();
           System.out.println(name + ": " + phone);
       }
       
       Scanner debate16 = new Scanner(new File("data\\Debate12016.txt"));
       
       while(debate16.hasNext()) {
           System.out.println(debate16.next());
       }
       
       //
    }
}
