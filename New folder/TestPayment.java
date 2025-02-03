abstract class Payment
{
	double amount;
	Payment(double amount)
	{
		this.amount = amount;
	}
	abstract void Payment();
}
class CredetCard extends Payment
{
	String cardNumber;
	CredetCard( double amount, String cardNumber)
	{
		super(amount);
		this.cardNumber = cardNumber;
	}
	void Payment()
	{
		System.out.println("Amount of the Payment:" + amount +   "cardNumber is : " + cardNumber);
	}
}
class TestPayment 
{
	public static void main(String args[])
	{
		CredetCard obj = new CredetCard(2000.00, "123587412-5257");
		obj.Payment();
	}
}