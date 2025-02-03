class MethodeDemo {
	public static void main(String z[]) {
	MethodeDemo obj = new MethodeDemo();
	double i = obj.add(5.5);
	double r = obj.add(6.5);
	System.out.println("height into inch= "+ i);
	System.out.println("height into inch= "+ r);
	}
	
	double add(double h) {
		int c = 12;
		double i = h*c;
		return i;
	}
}