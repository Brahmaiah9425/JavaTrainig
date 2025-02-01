interface MyFunctionalInterface 
{
	void execute();
}
public class LambdaDemo{
	public static void main(String args[])
	{
		MyFunctionalInterface my = () -> System.out.println("Hello Brahmaiah");
		my.execute();
	}

}
