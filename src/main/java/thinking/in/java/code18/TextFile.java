package thinking.in.java.code18;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class TextFile extends ArrayList<String>{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String file = read("src/thinking/in/java/code18/TextFile.java");
		write("src/txt/test.txt",file);
		TextFile tf = new TextFile("src/txt/test.txt");
		tf.write("src/txt/test2.txt");
		
		TreeSet<String> ts = new TreeSet<String>(new TextFile("src/thinking/in/java/code18/TextFile.java","\\W+"));
		System.out.println(ts.headSet("a"));
	}
	public static String read(String fileName)
	{
		StringBuilder sb = new StringBuilder();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(
					new File(fileName).getAbsoluteFile()));
			String str = null;
			while((str = br.readLine()) != null)
			{
				sb.append(str);
				sb.append("\n");
			}
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return sb.toString();
	}
	public static void write(String fileName,String text)
	{
		try
		{
			PrintWriter pw = new PrintWriter(new File(fileName).getAbsoluteFile());
			pw.print(text);
			pw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public TextFile(String fileName,String splitter)
	{
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals("")) remove(0);
	}
	public TextFile(String fileName)
	{
		this(fileName,"\n");
	}
	public void write(String fileName)
	{
		try
		{
			PrintWriter pw = new PrintWriter(new File(fileName).getAbsoluteFile());
			for(String item:this)
			{
				pw.println(item);
			}
			pw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
