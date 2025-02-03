class ArrayLarge 
{
	public static void main(String a[]) {
		int num[] = {10,20,30,40};
		int large =  num[0];
		for(int i=1; i<num.length; i++) {
				if(num[i]>large) {
					large = num[i];
				}
		}
		System.out.println("Large number is: " +large );
	}
}