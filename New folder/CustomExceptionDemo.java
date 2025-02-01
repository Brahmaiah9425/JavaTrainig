class InvalidAgeException extends Exception

{

	public InvalidAgeException(String msg)

	{

		super(msg);	

	}
 
}

class CustomExceptionDemo

{	

	public static void main(String ar[])

	{

		int age=18;

		try{

			if(age>18)

			{

				throw new InvalidAgeException("You are not eligible for vote.");

			}else{

				System.out.println("Yes!! You can give vote");

			}

		}catch(InvalidAgeException e)

		{

			System.out.println("Exception caught : "+e);

		}

	}

}
 
