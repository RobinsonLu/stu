package thinking.in.java.code18;

import java.util.ArrayList;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;

public class People extends ArrayList<Person> {

	public People(String firstName) throws Exception{
		Document doc = new Builder().build(firstName);
		Elements elements = doc.getRootElement().getChildElements();
		for (int i = 0; i < elements.size(); i++) {
			add(new Person(elements.get(i)));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		People p = new People("src/txt/People.xml");
		System.out.println(p);
	}

}
