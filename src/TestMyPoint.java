
import java.util.Scanner;
/**
 * GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *

 */
/**This is the user interface of the My Point Class*/
public class TestMyPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        MyPoint p1 = new MyPoint(x1, y1);
        System.out.println("p1 is " + p1.getX() + " " + p1.getY() );
        MyPoint p2 = new MyPoint(x2, y2);
        System.out.println("p2 is " + p2.getX() + " "+ p2.getY());

        System.out.println("The distance between p1 and p2 is "
                + p1.distance(p2));
    }
}
