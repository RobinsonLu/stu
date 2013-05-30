package thinking.in.java.code11;

import java.util.Map;

public class EnvironmentVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}

}
