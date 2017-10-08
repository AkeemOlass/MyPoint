
import static java.lang.Math.sqrt;
/**
 * GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *

 */

/** creates instance objects of points and finds the distance between them
 * the points have an x and y coordinate
 */
public class MyPoint {
    private  double x;
    private  double y;

    MyPoint(){
        /** this constructor creates an object. An object with no coordinate has a ddefault x and y of 0*/
        x = 0;
        y=0;
    }

    MyPoint(double _x, double _y){
        /** this constructor creates an object. An object with a specified
         * x and y coordinate */
        x=_x;
        y=_y;
    }
    /**finds the distance between points in the
 *  x and y coordinate form*/
    public double distance(double x1, double y1){
        /** dx= x1-Mypoint.x dy= y1-mypoint.y*/
        double dx  = x1 - getX();
        double dy = y1-getY();
        double Distance = sqrt((dx*dx)+(dy*dy));
        return  Distance;
    }
    /**finds the distance between points in the
     *object form*/
    public double distance(MyPoint p){

        return  distance(p.getX(),p.getY());
    }
    /**gets the x coordinate of an object*/
    public double getX(){
        return x;
    }
    /**gets the y coordinate of an object*/
    public double getY(){
        return y;
    }
    /**sets the y coordinate of a point object*/
    public MyPoint set(double __x, double __y){
        new MyPoint(__x,__y);

        return new MyPoint(x,y);
    }

}
