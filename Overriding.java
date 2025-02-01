class A
{
	int a = 10;
	void show() 
	{
		System.out.println("The value of a is : " +a);
	}
}
class B extends A
{
	int a = 20;
	void show() 
	{
		super.show();
		System.out.println(" Value of the a is : " +a);
	}
}
class Overriding 
{
	public static void main(String args[]) 
	{
		B obj = new B();
		obj.show();
	}
}
		