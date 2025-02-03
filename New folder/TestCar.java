abstract class Vehicle 
{
	 abstract void move();
}
class Car extends Vehicle
{
	void move() 
	{
		System.out.println("Car is moving");
	}
}
class TestCar {
	public static void  main(String args[])
	{
		Car obj = new Car();
		obj.move();
	}
}