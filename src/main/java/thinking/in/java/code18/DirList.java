package thinking.in.java.code18;

import java.io.File;
import java.util.Arrays;

public class DirList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("src/thinking/in/java/code18");
		String[] list = null;
		if(args.length  == 0) {
			list = path.list();
		}
		else {
			list = path.list(new DirFilter(args[0]));
			Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		}
		for(String dirItem:list) {
			System.out.println(dirItem);
		}
	}

}
