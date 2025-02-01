class A 
{
	int z = 100;
}
class B extends A 
{
	void show()
	{
		z = z*z;
		System.out.println("z*z value is : " +z);
	}
}
class C extends B 
{
	void tem() 
	{
		z = z+z;
		System.out.println("z+z is : " +z);
	}
}
class MultiLevelInheritance
{
	public static void main(String args[]) 
	{
		C obj = new C();
		obj.show();
		obj.tem();
	}
}