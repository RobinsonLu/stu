package thinking.in.java.code18;

import java.io.File;
import java.io.IOException;

public class ProcessFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProcessFiles(new ProcessFiles.Strategy()
		{
			public void process(File file)
			{
				System.out.println(file);
			}
		},"class||java").start(args);
	}
	
	public interface Strategy
	{
		void process(File file);
	}
	private Strategy strategy;
	private String ext;
	public ProcessFiles(Strategy strategy,String ext)
	{
		this.ext = ext;
		this.strategy = strategy;
	}
	public void start(String[] args)
	{
		try
		{
			if(args.length == 0)
			{
				processDirectoryTree(new File("."));
			}
			else
			{
				for(String arg:args)
				{
					File filearg = new File(arg);
					if(filearg.isDirectory())
					{
						processDirectoryTree(filearg);
					}
					else
					{
						if(!arg.endsWith("."+ext))
							arg += "."+ext;
						strategy.process(new File(arg).getCanonicalFile());
					}
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void processDirectoryTree(File root) throws IOException
	{
		for(File file:Directory.walk(root.getAbsolutePath(),".*\\."+ext))
			strategy.process(file.getCanonicalFile());
	}
}
