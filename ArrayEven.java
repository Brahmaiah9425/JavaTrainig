class ArrayEven 
{
	public static void main(String a[]) {
		int num[] = {10,20,25,40};
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				System.out.println("Even number: " +num[i]);
			} else {
				System.out.println("odd number: " +num[i]);
			}
		}
	}
}