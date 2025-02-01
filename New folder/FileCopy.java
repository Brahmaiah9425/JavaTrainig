import java.nio.file.*;
import java.io.IOException;
class FileCopy
{
	public static void main(String ar[])
	{
		try{
			Path source = Paths.get("example.txt");
			Path target = Paths.get("copy_example.txt");
			Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File copied");

 
			}
			catch(IOException e)
			{
			System.out.println("Exception : "+e);
			}
	}
}