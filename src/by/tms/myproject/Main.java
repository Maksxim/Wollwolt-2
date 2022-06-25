package by.tms.myproject;

public class Main {

    public static void main(String[] args){

        Point a = new Point(20, 10);
        Point b = new Point(40, 20);
        Rectangle r = new Rectangle(a ,b);

        System.out.println("Distance = " + b.distance(a));
        System.out.println("Plosthad = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        System.out.println("Diogonal = " + r.diogonal());
    }
}

