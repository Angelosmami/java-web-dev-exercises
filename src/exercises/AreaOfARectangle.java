package exercises;

import java.util.Scanner;



public class AreaOfARectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double recLength = input.nextDouble();
        System.out.println("What is the rectangles width?");
        double recWidth = input.nextDouble();
        System.out.println("The area of the rectangle is " + (recLength * recWidth));

    }
}
