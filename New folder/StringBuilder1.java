class StringBuilder1
{
	public static void main(String args[])
	{
		StringBuilder1 sb = new StringBuilder1("Brahmaiah");
		System.out.println("String Builder  : "+sb);
		sb.append("Thangedupalli");
		System.out.println("String Builder  : "+sb);
		sb.insert(9, ",");
		System.out.println("String builder after inserting , comma : "+sb);
		sb.reverse();
		System.out.println("String builder after Reverse  : "+sb);
		sb.reverse();
		System.out.println("String builder after Reverse again : "+sb);
		sb.delete(9,10);
		System.out.println("String builder : "+sb);
		sb.replace(0,9,"Hi");
		System.out.println("String builder after replacing  : "+sb);

 
 
	}
}