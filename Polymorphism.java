class Polymorphism {
	double t;
	double c = 0.5;
	double p = 3.142;
	public static void main(String a[]) {
	Polymorphism obj =  new Polymorphism();
	obj.add(10.0);
	obj.add(10);
	}
	void add(int a)
	{
		t = a*a;
		System.out.println("Area of the square: " +t);
	}
	void add(int a, int b, double c)
	{
		t = c*(a*b);
		System.out.println("Area of the triangle: " +t);
	}
	void add(int a, int b)
	{
		t = a*b;
		System.out.println("Area of the rectangle: " +t);
	}
	void add(double r)
	{
		t = p*(r*r);
		System.out.println("Area of the circle: " +t);
	}
}