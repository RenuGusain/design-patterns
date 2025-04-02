package renu.gusain.design.pattern.creational.factory;

 class Point1 {
    private double x,y;
    private Point1(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

     static class  PointFactory
     {
         public static Point1 getCartesianPoint(double x,double y)
         {
             return new Point1(x,y);
         }
         public static Point1 getPolarPoint(double radius,double theta)
         {
             return new Point1(radius*Math.cos(theta),radius*Math.sin(theta));
         }

     }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public  class DemoWithFactoryClass

{
    public static void main(String[] args) {
        Point1 cartesaianPoint=Point1.PointFactory.getCartesianPoint(3,4);
        Point1 polarPoint=Point1.PointFactory.getPolarPoint(5,30);
        System.out.println("Cartesian point: "+cartesaianPoint);
        System.out.println("Polar point: "+polarPoint);
    }
}

