package sk.akademiasovy.point;

import sk.akademiasovy.abstrakt.Student;
import sk.akademiasovy.abstrakt.Teacher;
import sk.akademiasovy.date.MyDate;
import sk.akademiasovy.other.MyClass;
import sk.akademiasovy.abstrakt.Person;

import java.sql.SQLOutput;


public class Main  {
    public static void main(String[] args) {
        Point p1 = new Point(8, 12);
        System.out.println("Point p1 is in " + p1.getQuadrant() + " quadrant");
        Point p2 = new Point();
        p2.generateRandomCoord();
        System.out.println("Point p2 is in " + p2.getQuadrant() + " quadrant");
        p2.print();
        System.out.println("Distance between p1 and p2 is " + p1.getDistanceFromOtherPoint(p2));

        // 3D
        Point3D p31 = new Point3D(8, 6, -7);
        Point3D p32 = new Point3D();
        p32.generateRandomCoord();
        p31.print();
        p32.print();
        System.out.println("Distance between p31 and p32 is " + p31.getDistanceFromOtherPoint(p32));
        Object o1 = new Point();
        Point p3 = new Point3D(2, 8, 7);


        System.out.println(p3.getDistance());
        Point3D p33 = (Point3D) p3;
        //Point3D p34=new Point();
        ((Point3D) p3).test();

        Geometry g1;
        g1 = new Point(5, -9);
        ((Point) g1).print();

        Geometry[] arr = new Geometry[10];
        int i;
        for (i = 0; i < 10; i++) {
            Point3D p = new Point3D();
            p.generateRandomCoord();
            arr[i] = p;
        }
        for (Geometry g : arr) {
            ((Point3D) g).print();
        }

        Point bod15 = new Point(2, 5);

        Line line1 = new Line(bod15, new Point(10, 4));
        Line line2 = new Line(1, 3, 4, 6);
        System.out.println("Distance between a and b is:" + line1.getLength());
        line2.getMiddlePointOfLine().print();
       Triangle t1= new Triangle(new Point(3,3),new Point(4,7),new Point(5,3));
       if(t1.isIsosceles())
           System.out.println("Triangle is Isosceles");
       else
           System.out.println("Triangle isnt isosceles");

       MyDate myDate= new MyDate();
       myDate.today();
       myDate.today2();

        MyClass name = new MyClass();
        System.out.println(name.isEmailValid("janko@mrkva.sk"));

        Person p = new Teacher();


        ((Teacher)p).setSalary(2200); //pretypovanie ((nový typ)premenná)

        Person s = new Student();
        if(s instanceof Teacher)
        ((Teacher)s).setSalary(2200);


        Object ppp= new Student();
        ((Person)ppp).setAge(58);


    }
}




