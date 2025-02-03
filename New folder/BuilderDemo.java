class BuilderDemo
{
	public static void main(String args[])
	{
		BuilderDemo sB = new BuilderDemo("Brahmaiah");
		System.out.println("String Builder  : "+sB);
		sB.append("Thangedupalli");
		System.out.println("String Builder  : "+sB);
		sB.insert(9, ",");
		System.out.println("String builder after inserting , comma : "+sB);
		sB.reverse();
		System.out.println("String builder after Reverse  : "+sB);
		sB.reverse();
		System.out.println("String builder after Reverse again : "+sB);
		sB.delete(9,10);
		System.out.println("String builder : "+sb);
		sB.replace(0,9,"Hi");
		System.out.println("String builder after replacing  : "+sB);

 
 
	}
}