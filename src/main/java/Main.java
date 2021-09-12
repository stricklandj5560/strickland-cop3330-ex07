import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    final static double convFactor = 0.09290304;
    public static void main(String[] args) {
        try {
            double length, width = 0;
            Scanner scan = new Scanner(System.in);
            System.out.print("What is the length of the room in feet? ");
            length = scan.nextDouble();
            System.out.print("What is the length of the room in feet? ");
            width = scan.nextDouble();
            double area = length * width;
            double conversion = area * convFactor;
            System.out.println(
                    String.format("You entered dimensions of %s feet by %s feet.", length, width));
            System.out.println("The area is\n" + area + " square feet.");
            System.out.println(conversion + " square meters.");
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
