abstract class Arithematic 
{
	abstract void sub(int a, int b);
}
class Addition extends Arithematic
{
	void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("The of the  to numbers is: " +c);
	}
}
class TestA
{
	public static void main(String args[]) {
	Addition obj =  new Addition();
	obj.sub(50,30);
	}
}