package sk.akademiasovy.point;

public class Triangle implements  InterfaceTriangle
{
    private Point a;
    private Point b;
    private Point c;



    public Triangle(Point a, Point b, Point c)
    {

        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getSideA()
    {
        return b.getDistanceFromOtherPoint(c);


    }
    public  double getSideB()
    {
       return a.getDistanceFromOtherPoint(c);

    }

    public double getSideC()
    {
       return b.getDistanceFromOtherPoint(a);

    }

    public double getPerimeter()
    {
        return getSideA()+getSideB()+getSideC();

    }

  public double getArea()
  {
      return 0;


  }

    @Override
    public boolean isRectangular() {
        if((getSideA()*getSideA()+getSideB()*getSideB()==getSideC()*getSideC()&&getSideB()*getSideB()+getSideC()*getSideC()==getSideA()*getSideA()&&getSideC()*getSideC()+getSideA()+getSideA()==getSideB()*getSideB()))


        {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean isEquilateral() {
        if(getSideA()==getSideB()&&getSideB()==getSideC())
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean isIsosceles() {
       if(getSideA()==getSideC() || getSideA()==getSideB()|| getSideC()==getSideB())
       {
           return true;
       }
       else
           return false;
    }


}

