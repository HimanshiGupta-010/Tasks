abstract class Shape {

    abstract void perimeter();
    abstract void area();
}

class Circle extends Shape {
    
    void perimeter()
    {
        System.out.println("Inside class circle");
        System.out.println("Perimeter of Circle : 2*PI*r");
    }

    void area()
    {
        System.out.println("Inside class circle");
        System.out.println("Area of circle : PI*r*r");
    }
}

class Rectangle extends Shape {

    void perimeter()
    {
        System.out.println("Inside class rectangle");
        System.out.println("Perimeter of rectangle : 2(length + breadth)");
    }

    void area()
    {
        System.out.println("Inside class rectangle");
        System.out.println("Area of rectangle : length * breadth");
    }
}
public class Formula {

    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.perimeter();
        r.area();

        c.perimeter();
        c.area();
    } 
}

