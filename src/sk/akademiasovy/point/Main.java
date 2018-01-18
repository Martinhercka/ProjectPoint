package sk.akademiasovy.point;

public class Main
{
    public static void main(String[] args)
    {
    Point p1 = new Point(8,12);
        System.out.println("Point P1 is in "+p1.getQuadrant()+" quadrant");
        Point p2 = new Point();
        p2.generateRandomCoord();
        System.out.println("Point P2 is in "+p2.getQuadrant()+" quadrant");
        Point p3= new Point(12,10);
        System.out.println("Distance is "+p3.getDistance());
        p2.printInfo();
        System.out.println("Distance between P1 and P2 is:"+p1.getDistanceFromOtherPoint(p2));
        System.out.println();





    }
}
