class PersonDetails
{
	String name;
	int age;
	String city;
	PersonDetails(String name, int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
	void show()
	{	
		System.out.println("Name : "+name + " Age : " +age + " city : "+city);
	}
	
}
class ConsArray 
{
	public static void main(String args[]) 
	{
		PersonDetails[] P = {new PersonDetails("Brahmaiah",22,"Nellore"), new PersonDetails("Ravi",23,"Nellore")};
		System.out.println(" Person Details : ");
		for(PersonDetails per: P) 
		{
			per.show();
		}
	}
}