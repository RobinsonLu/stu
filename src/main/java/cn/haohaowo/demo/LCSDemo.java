package cn.haohaowo.demo;

public class LCSDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "123345678";
		String str2 = "23345678";
		String lcs = LCS(str1, str2);
		System.out.println(lcs);
	}

	
	public static String LCS(String str1, String str2) {
		if(null == str1 || "".equals(str1)) {
			return "";
		}
		
		if(null == str2 || "".equals(str2)) {
			return "";
		}
		
		int[] il = new int[str1.length()]; 
		int max = 0;
		int maxj = 0;
		
		for(int i = 0; i <= str2.length() - 1; i++) {
			for(int j = str1.length() - 1; j >= 0; j--) {
				if(str2.charAt(i) == str1.charAt(j)) {
					if(i == 0 || j == 0) {
						il[j] = 1;
					} else {
						il[j] = il[j - 1] + 1;
					}
				} else {
					il[j] = 0;
				}
				
				if(il[j] > max) {
					max = il[j];
					maxj = j;
				}
			}
		}
		if(max == 0) {
			return "";
		}
		return str1.substring(maxj - max + 1, maxj + 1);
	}
}
