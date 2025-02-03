import java.util.Scanner;
class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String message)
	{
		super(message);
	}
}
class PasswordValidate 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%?&*])[A-za-z\\d@$!%?&*]{8,15}$";
		try
		{
			if(password.matches(regex))
			{
				System.out.println("Password is strong");
			}
			else
			{
				throw new InvalidPasswordException("Password is weak. add atleast one capital, small, number,special char to make strong password");
			}
		} catch (InvalidPasswordException e) {
				System.out.println("Exception caught: " + e);
		}
	}
}