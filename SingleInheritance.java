class A 
{
	int num = 10;
}
class B extends A
{
	void show() 
	{
		System.out.println("the nymber is : " +num);
	}
}
class SingleInheritance 
{
	public static void main(String a[]) {
	B obj = new B();
	obj.show();
	}
}