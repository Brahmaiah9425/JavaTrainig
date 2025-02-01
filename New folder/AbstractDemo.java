abstract class AbstractDemo 
{
	abstract void show(int sum);
	abstract int add(int a, int b);
}
class SubClass extends AbstractDemo
{
	int add(int a, int b)
	{ 
		return a+b;
	}
	void show( int sum)
	{
		System.out.println("Sub Class sum is: " +sum);
	}
	public static void main(String args[]) 
	{
		SubClass obj = new SubClass();
		int sum = obj.add(10, 20);
		obj.show(sum);
	}
}