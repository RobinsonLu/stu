package thinking.in.java.code13;

import thinking.in.java.code18.BinaryFile;

public class Hex {

	public static String format(byte[] data){
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if(n % 16 == 0){
				result.append(String.format("%05X: ", n));
			}
			result.append(String.format("%02X", b));
			n++;
			if(n % 16 == 0) result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		if(args.length == 0){
			System.out.println(format(BinaryFile.read("bin/thinking/in/java/code13/Hex.class")));
		}else{
			System.out.println(format(BinaryFile.read(args[0])));
		}
	}

}
