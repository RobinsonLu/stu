package thinking.in.java.code18;
import java.util.*;
import java.io.*;
import java.util.regex.*;
public class DirList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("src/thinking/java/space18");
		String[] list = null;
		if(args.length == 0)
		{
			list = path.list();
		}
		else
		{
			list = path.list(filter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list)
		{
			System.out.println(dirItem);
		}
	}
	private static FilenameFilter filter(final String regex)
	{
		return new FilenameFilter()
		{
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir,String name)
			{
				return pattern.matcher(name).matches();
			}
		};
	}
}
