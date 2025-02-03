class CompoundInterest {
	int p = 10000, t = 5, r =2;
	int a = p*(1+r/100)^t;
	int c = a - p;
	public static void main(String a[]) {
		CompoundInterest obj = new CompoundInterest();
		System.out.println("compound Interest: " +obj.c);
	}
}