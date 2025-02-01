import java.io.File;
import java.io.IOException;
class FileDemo
{
	public static void main(String ar[])
	{
		try{
			File file=new File("example.txt");
			if(file.createNewFile())
			{
				System.out.println("File Created : "+ file.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}catch(IOException e)
		{
			System.out.println("Exception caught : "+e);
		}
	}
}