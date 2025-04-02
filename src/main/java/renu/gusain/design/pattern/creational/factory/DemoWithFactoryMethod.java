package renu.gusain.design.pattern.creational.factory;

 class Point {
    private double x,y;
    private Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public static Point getCartesianPoint(double x,double y)
    {
        return new Point(x,y);
    }
    public static Point getPolarPoint(double radius,double theta)
    {
        return new Point(radius*Math.cos(theta),radius*Math.sin(theta));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public  class DemoWithFactoryMethod
{
    public static void main(String[] args) {
        Point cartesaianPoint=Point.getCartesianPoint(3,4);
        Point polarPoint=Point.getPolarPoint(5,30);
        System.out.println("Cartesian point: "+cartesaianPoint);
        System.out.println("Polar point: "+polarPoint);
    }
}

