package cn.haohaowo.json;

import org.json.JSONException;
import org.json.JSONObject;


public class Test {

	public static void main(String[] args) throws JSONException {
		String json = "{\"name\":\"total\"}";
		JSONObject jsonobject = new JSONObject(json);
		String name = jsonobject.getString("name");
		
		
		jsonobject.put("my", name.substring(0,1).toUpperCase());
		
		String like[] = new String[]{"javascript","java"};
		jsonobject.put("like", like);
		
		System.out.println(jsonobject);
	}

}
