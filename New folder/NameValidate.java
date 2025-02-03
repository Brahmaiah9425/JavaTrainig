import java.util.Scanner;
class InvalidNameException extends Exception
{
	public InvalidNameException(String message)
	{
		super(message);
	}
}
class NameValidate 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String name = sc.nextLine();
		String regex="^(?=.*[A-Z]){8,15}$";
		try
		{
			if(name.matches(regex))
				{
					System.out.println("Name is only  in capital letters");
				}
				else
				{
					throw new InvalidNameException("the name is not in capital");
				}
		} catch(InvalidNameException e) {
					System.out.println("Exception caught: " + e);
		}
	}
}