class ExceptionDemo
{
	public static void main(String ar[])
	{
	int a[]={10,20,10};
	try{
		int c=a[1]/0;
		System.out.println("array value c = "+c);
		System.out.println("array value = "+a[1]);
	}
	catch(ArrayIndexOutOfBoundsException|ArithmeticException e)// or catch(Excetion e)
	{
		System.out.println("Exception Caught : "+e);
	}
	finally
	{
		System.out.println("Finally block executed");	
	} 
	System.out.println("Today we have meeting at 4:00Pm");
	}
}