abstract class Shape
{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Circle extends Shape
{
	double pi=3.142;
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	double calculateArea()
	{
		return pi*radius*radius;
	}
	double calculatePerimeter() 
	{
		return 2 * pi * radius;
	}
}
class Rectangle extends Shape
{
	private double length;
    private double breadth;
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	double calculateArea()
	{
		return length * breadth;
	}
	double calculatePerimeter()
	{
		return 2 * (length + breadth);
	}
}
class Triangle extends Shape
{	
	double h = 0.5;  
	private double sideA, sideB, sideC;
	Triangle(double sideA,  double sideB,  double sideC)
	{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	double calculateArea()
	{
		return h * ( sideA * sideB);
	}
	double calculatePerimeter()
	{
		return (sideA + sideB + sideC);
	}
}
public class shapeTest {
	public static void main(String args[])
	{
		Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
		
		Shape rectangle = new Rectangle(4, 7);
        System.out.println("\nRectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
		
		Shape triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
	}
}
	












