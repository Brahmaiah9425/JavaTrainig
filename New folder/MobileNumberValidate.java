import java.util.Scanner;
class InvalidMobileNumberException extends Exception
{
	public InvalidMobileNumberException(String message)
	{
		super(message);
	}
}
class MobileNumberValidate
{	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter Mobile Number: ");
	String mobileNumber = sc.nextLine();
	try
	{
		if(mobileNumber.length() != 10)
		{
			throw new InvalidMobileNumberException("Mobile number must be a 10-digit numeric value");
		} else {
			System.out.println("Mobile number is valid");
		}
	} catch (InvalidMobileNumberException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}