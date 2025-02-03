class Method {
	public static void main(String z[]) {
	MethodeDemo obj = new MethodeDemo();
	int c = obj.age(2002,2024);
	System.out.println("Age is = " + c);
	}
	
	
	int age(int a, int b){
		int c = b - a;
		return c;
	}
}