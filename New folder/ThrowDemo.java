class ThrowDemo
{
	public static void main(String ar[])
	{
		boolean b=true;
		try{
			if(b)
			{
			 throw new ArithmeticException("if block throws an exception");
			}
 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 
	}
}