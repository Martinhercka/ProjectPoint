package sk.akademiasovy.point;

import java.util.Random;

public class Point3D extends Point
{
    private int z;

    public int getZ()
    {
        return z;
    }

    

    public Point3D(int x,int y,int z)
    {
        super(x,y); // vola konstruktor rodiča a posiela mu dva parametre

        this.z=z;
    }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);

    }

    @Override
    public void generateRandomCoord() {
        Random random = new Random();
        this.z=random.nextInt(41)-20;
        super.generateRandomCoord();
    }


    public double getDistanceFromOtherPoint(Point3D other) {

        return Math.sqrt((Math.pow(getX()-other.getX(),2))+(Math.pow(getY()-other.getY(),2))+Math.pow(z-other.getZ(),2));

    }

    public void  printInfo()
    {
        System.out.println("Point:{"+getX()+","+getY()+","+getZ()+"}" +" Q:"+getQuadrant()+" Distance:"+getDistance());

    }

}
