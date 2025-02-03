import java.util.Scanner;
class InvalidEmailException extends Exception
{
	public InvalidEmailException(String message)
	{
		super(message);
	}
}
class EmailValidate 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String email = sc.nextLine();
		String regex="^(?=.*[a-z])(?=.*[@.]){8,30}$";
		try
		{
			if(email.matches(regex))
				{
					System.out.println("vaild email");
				}
				else
				{
					throw new InvalidEmailException("in valid email");
				}
		} catch(InvalidEmailException e) {
					System.out.println("Exception caught: " + e);
		}
	}
}