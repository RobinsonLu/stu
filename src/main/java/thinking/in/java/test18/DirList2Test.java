package thinking.in.java.test18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2Test {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		File path = new File("src/thinking/java/space18");
		String[] list = null;
		if(args.length == 0)
		{
			list = path.list();
		}
		else
		{
			list = path.list(new FilenameFilter()
			{
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir,String name)
				{
					return pattern.matcher(name).matches();
				}
			});
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list)
		{
			System.out.println(dirItem);
		}
	}
}
