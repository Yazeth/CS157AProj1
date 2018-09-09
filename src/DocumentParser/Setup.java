package DocumentParser;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Setup {
	
	public static void main(String[] args)
	{
//		File[] documents = GetDocuments();
//		BuildTable(documents);
//		for(File doc: documents)
//		{
//			ReadDocument(doc);
//		}
	}
	
	public static void BuildTable(File[] documents)
	{
		
	}
	
	public static File[] GetDocuments()
	{
		File file = new File("Documents");
		return file.listFiles();
	}
	
	public static ArrayList<String> ReadDocument(File document)
	{
		ArrayList<String> lines = new ArrayList<>();
		String currentLine;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(document));
			while((currentLine = reader.readLine()) != null)
			{
				CountSpecialCharacters(currentLine);
				for(String s: currentLine.split("[^\\w\\*]"))
				{
					if(!s.isEmpty())
					{
						lines.add(s);
					}
				}
			}
			reader.close();
			
		} catch (Exception e) {
			System.out.println("MY B");
			e.printStackTrace();
		}
		
		return lines;
			
	}
	
	public static void CountSpecialCharacters(String input)
	{
		input.trim();
		String[] words = input.split("([a-zA-Z0-9])|([\\s])");
		for(String s: words)
		{
			if(!s.isEmpty())
			{
				//Insert into DB
			}
			
		}
		
	}
}
