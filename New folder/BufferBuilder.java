class BufferBuilder
{
	public static void main(String ar[])
	{
	StringBuffer sBuf=new StringBuffer("Brahmaiah");
	System.out.println("String Buffer  : "+sBuf);
	sBuf.append(" Thangedupalli");
	System.out.println("String Buffer after append : "+sBuf);
	sBuf.insert(9, ",");
	System.out.println("String Buffer after inserting , comma : "+sBuf);
	sBuf.reverse();
	System.out.println("String Buffer after Reverse  : "+sBuf);
	sBuf.reverse();
	System.out.println("String Buffer after Reverse again : "+sBuf);
	sBuf.delete(9,10);
	System.out.println("String Buffer  : "+sBuf);
	sBuf.replace(0,9,"Hi");
	System.out.println("String Buffer after replacing  : "+sBuf);
	}
}
