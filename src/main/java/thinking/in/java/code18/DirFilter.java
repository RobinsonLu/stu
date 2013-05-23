package thinking.in.java.code18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirFilter implements FilenameFilter {

	private Pattern pattern;
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}
	public DirFilter(String regex)
	{
		pattern = Pattern.compile(regex);
	}
}
