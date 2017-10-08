import org.junit.Assert;
/**
 * GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *

 */
import static org.junit.Assert.*;

public class MyPointTest {
    /**JUNIT TEST*/
    @org.junit.Test
    public void distance() throws Exception {
        MyPoint pt = new MyPoint(10 , 30.5);
        double D = 32.09750769;
        MyPoint defau = new MyPoint();
        Assert.assertEquals(D, defau.distance(10 ,30.5), 0.5);
    }

    @org.junit.Test
    public void distance1() throws Exception {
        MyPoint pt = new MyPoint(10 , 30.5);
        double D = 32.09750769;
        MyPoint defau = new MyPoint();
        Assert.assertEquals(D, defau.distance(pt),0.5);
    }

}