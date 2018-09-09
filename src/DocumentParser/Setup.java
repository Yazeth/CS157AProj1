package DocumentParser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Setup {
	
	public static void main(String[] args)
	{
		File[] documents = GetDocuments();
		BuildTable(documents.length);
		for(File doc: documents)
		{
			String currentDocument = ReadDocument(doc);
			String[] tokens = GetTokens(currentDocument);
			for(String token: tokens)
			{
				System.out.println(token);
//				AddToDataBase(token);
			}
		}
	}
	
	public static void BuildTable(int numberOfDocuments)
	{
		
	}
	
	public static File[] GetDocuments()
	{
		File file = new File("Documents");
		return file.listFiles();
	}
	
	public static String ReadDocument(File document)
	{
		String result = null;
		try {
			 result = new String(Files.readAllBytes(Paths.get(document.getAbsolutePath())), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String[] GetTokens(String input)
	{
		String[] words = input.split("([^a-zA-Z0-9']+)'*\\1*");
		return words;
		
	}

}
