import java.io.FileWriter;
import java.io.IOException;
class FileWriting
{
	public static void main(String args[])
	{
		try(FileWriting file1 = new FileWriting("example.txt"))
		{
			file1.write("Hello Brahmaiah");
			System.out.println("Yes You have written file");
		}
		catch(IOException e)
		{
			System.out.println("Exception caught : "+ e);
		}
	}
}