package thinking.in.java.code14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {

	/**
	 * @param args
	 */
	
	private static String usage = "Usage:\nShowMethods qualified.class.name\n" +
		"To show all methods in class or:\nShowMethods qualified.class.name word\n" +
		"To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		args = new String[]{"thinking.in.java.code14.ShowMethods"};
		if(args.length < 1){
			System.out.println(usage);
			System.exit(0);
		}
		
		int lines = 0;
		try{
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1){
				for(Method method : methods){
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				}
				for(Constructor ctor : ctors){
					System.out.println(p.matcher(ctor.toString()).replaceAll(""));
				}
				lines = methods.length + ctors.length;
			}else{
				for(Method method : methods){
					if(method.toString().indexOf(args[1]) != -1){
						System.out.println(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				}
				for(Constructor ctor : ctors){
					if(ctor.toString().indexOf(args[1]) != -1){
						System.out.println(p.matcher(ctor.toString()).replaceAll(""));
					}
					lines++;
				}
			}
		}catch(Exception e){
			System.out.println("No such class : " + e);
		}
	}

}
