package thinking.in.java.code18;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public final class Directory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0)
		{
			System.out.println(walk("."));
		}
		else
		{
			for(String arg:args)
			{
				System.out.println(arg);
			}
		}
	}
	public static File[] local(File dir,final String regex)
	{
		return dir.listFiles(new FilenameFilter()
		{
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir,String name)
			{
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	}
	public static File[] local(String path,final String regex)
	{
		return local(new File(path),regex);
	}
	public static class TreeInfo implements Iterable<File>
	{
		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
		
		public Iterator<File> iterator()
		{
			return files.iterator();
		}
		public void addAll(TreeInfo other)
		{
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		public String toString()
		{
			return "dirs:"+PPrint.pformat(dirs)+";\n\nfiles:"+PPrint.pformat(files);
		}
	}
	public static TreeInfo walk(String start,String regex)
	{
		return recourseDirs(new File(start),regex);
	}
	public static TreeInfo walk(File start,String regex)
	{
		return recourseDirs(start,regex);
	}
	public static TreeInfo walk(File start)
	{
		return recourseDirs(start,".*");
	}
	public static TreeInfo walk(String start)
	{
		return recourseDirs(new File(start),".*");
	}
	private static TreeInfo recourseDirs(File startDir, String regex) {
		// TODO Auto-generated method stub
		TreeInfo result = new TreeInfo();
		for(File item:startDir.listFiles())
		{
			if(item.isDirectory())
			{
				result.dirs.add(item);
				result.addAll(recourseDirs(item,regex));
			}
			else
			{
				if(item.getName().matches(regex))
				{
					result.files.add(item);
				}
			}
		}
		return result;
	}
}
