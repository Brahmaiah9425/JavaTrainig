class Biodata {
	String name = "Brahmaiah";
	String dob = "15/8/2002";
	int age = 23;
	double height = 5.5;
	boolean isEmployee = true;
	public static void main(String args[]) {
		Biodata obj = new Biodata();
		System.out.println("Biodata:");
		System.out.println("DOB: " +obj.dob);
		System.out.println("Name: " +obj.name);
		System.out.println("Age: " +obj.age);
		System.out.println("Height: " +obj.height);
		System.out.println("IsEmployee: " +obj.isEmployee);
	}
}