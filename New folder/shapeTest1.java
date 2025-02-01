interface Shape
{
	public double calculateArea();
	public double calculatePerimeter();
}
class Circle implements Shape
{
	double pi=3.142;
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	public double calculateArea()
	{
		return pi*radius*radius;
	}
	public double calculatePerimeter() 
	{
		return 2 * pi * radius;
	}
}
class Rectangle implements Shape
{
	private double length;
    private double breadth;
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double calculateArea()
	{
		return length * breadth;
	}
	public double calculatePerimeter()
	{
		return 2 * (length + breadth);
	}
}
class Triangle implements Shape
{	
	double h = 0.5;  
	private double sideA, sideB, sideC;
	Triangle(double sideA,  double sideB,  double sideC)
	{
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public double calculateArea()
	{
		return h * ( sideA * sideB);
	}
	public double calculatePerimeter()
	{
		return (sideA + sideB + sideC);
	}
}
public class shapeTest1 {
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