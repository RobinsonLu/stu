package thinking.in.java.code18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D://input.txt");
			br = new BufferedReader(fr);
			List<StringContainer> list = new ArrayList<StringContainer>();
			String str = br.readLine();
			
			
			
			
			while(str!=null){
				
				str = str.replaceAll("[^a-zA-Z_0-9]", "");
				str = str.replaceAll("[a-bA-C]", "2");
				str = str.replaceAll("[d-fD-F]", "3");
				str = str.replaceAll("[g-iG-I]", "4");
				str = str.replaceAll("[j-lJ-L]", "5");
				str = str.replaceAll("[m-oM-O]", "6");
				str = str.replaceAll("[p-sP-S]", "7");
				str = str.replaceAll("[t-vT-V]", "8");
				str = str.replaceAll("[w-zW-Z]", "9");
				
//				System.out.println(str);
				
				if(7 == str.length()){
					str = str.substring(0,3)+"-"+str.substring(3,7);
					StringContainer sc = new StringContainer();
					sc.setStr(str);
					sc.setCount(1);
					list.add(sc);
				}
				
				
				str = br.readLine();
			}
			
			for(int i = 0; i < list.size(); i++){
				for(int j = i+1; j < list.size(); j++){
					if(list.get(i).getStr().equals(list.get(j).getStr())){
						list.get(i).setCount(list.get(i).getCount()+1);
						list.remove(j);
						j--;
					}
				}
			}
			
			for(StringContainer l:list){
				System.out.println(l.getStr()+"<-->"+l.getCount());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
		}
	}
	
	
}



class StringContainer {
	private String str;
	private int count;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}