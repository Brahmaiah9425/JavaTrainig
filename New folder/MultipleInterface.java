interface Student
{
	String name = "Brahmaiah";
	int id = 1;
	void show();
}
interface Results
{
	int marks = 90;
	void display();
	default void test()
	{ 
	System.out.println(" over Ridden ");
	}
}
class college implements Student, Results 
{
	public void test()
	{
		System.out.println (" yes it is over ridden");
	}
	public void show()
	{
		System.out.println(" Student Info : ");
		System.out.println(" Name : " + name + "Id : " +id);
	}
	public void display()
	{
		System.out.println(" Marks : " + marks);
		System.out.println("Remarks =  We have passed with Grade 1 percentage");
	}
}
class MultipleInterface
{
	public static void main(String args[]) 
	{
		college c = new college();
		c.show();
		c.display();
		c.test();
	}
}
		
























