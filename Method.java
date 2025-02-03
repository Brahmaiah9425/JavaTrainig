class Method {
	public static void main(String z[]) {
	Method obj = new Method();
	int c = obj.age(2002,2024);
	int f = obj.age(2002,2024);
	System.out.println("Age is = " + c);
	System.out.println("Age is = " + f);
	}
	
	
	int age(int a, int b){
		int c = b - a;
		return c;
	}
}