class MethodCi {
	public static void main(String z[]){
	MethodCi obj = new MethodCi();
	int c = obj.com(5000,5,2);
	System.out.println("CI is = " + c);
	}
	int com(int p,int r,int t){
	int a = p*(1+r/100)^t;
	int c = a - p;
	return c;
	}
}
	