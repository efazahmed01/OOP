import util.*;
abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    double rad;
    Circle(double rad){
        this.rad = rad;
    }
    double area(){
        return 3.1416*rad*rad;
    }
}

class Trangle extends Shape{
    double height,width;
    Trangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    double area(){
        return 0.5*height*width;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double x = sc.nextDouble();
		Circle c = new Circle(x);
		System.out.println("Circle area is "+c.area());
		Trangle t = new Trangle(10,20);
		System.out.println("Trangle area is "+t.area());
	}
}
