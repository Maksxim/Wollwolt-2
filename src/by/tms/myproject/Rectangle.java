package by.tms.myproject;

public class Rectangle {

    private Point a;
    private Point b;

    public Rectangle(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    public Rectangle(){}

    public double area (){
        double f = Math.abs((a.getX() - b.getX()) *(a.getY() - b.getY()));
        return f;
    }
    public double perimeter(){
        double l = Math.abs(a.getX() - b.getX()) * 2 + Math.abs(a.getY() - b.getY() *2);
        return l;
    }
    public double diogonal(){
        double i = Math.sqrt(Math.abs((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) *
                (a.getY() - b.getY())));
        return i;
    }

}
