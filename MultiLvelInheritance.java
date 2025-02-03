class A 
{
	int a = 100;
}
class B extends A 
{
	void show()
	{
		a = a*a;
		System.out.println("a*a value is : " +a);
	}
}
class C extends B 
{
	void tem() 
	{
		a = a+a;
		System.out.println("a+a is : " +a);
	}
}
Class MultiLvelInheritance
{
	public static void main(String a[]) {
	C obj = new C();
	B abc = new B();
	obj.show();
	abc.tem();
	}
}