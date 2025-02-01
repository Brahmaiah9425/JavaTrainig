import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
class FileAllDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file name: ");
		String obj = sc.nextLine();
		try
		{
			File file = new File(obj);
			if(file.createNewFile())
			{
				System.out.println("File Created : "+ file.getName());
				FileWriter writer = new FileWriter(file);
				writer.write("Hello Brahmaiah, How are you?");
				System.out.println("Successfuly wrote to the file");
			}
			else 
			{
				System.out.println("File already exists.");
			}
			if(file.exists())
			{
				System.out.println("File Reading... ");
				Scanner fileScanner = new Scanner(file);
				while(fileScanner.hasNextLine())
				{
					String data= fileScanner.nextLine();
					System.out.println(data);
				}
			}
			
			if( file.getName().equals ("pavan.txt") )
			{
				if(file.delete())
				{
					System.out.println("File is deleted Successfully.");
				}
				else
				{
					System.out.println("Fail to delete file.");
				}
			}
			
		} catch(IOException e)
		{
			System.out.println("Exception caught : "+e);
		}
				
		
	}
}

