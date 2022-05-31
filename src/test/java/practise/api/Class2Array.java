package practise.api;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Class2Array {
	public static void main(String [] args) throws IOException, ParseException {
		FileReader reader = new FileReader("C:\\Users\\WIN10\\eclipse-workspace\\APICLASS\\src\\test\\resources\\APIJSON\\listuseer.json");
		JSONParser jsonparser = new JSONParser();
		Object obj = jsonparser.parse(reader);
		JSONObject j = (JSONObject)obj;
		Object objpage = j.get("page");
		System.out.println(objpage);
		Object objperpage = j.get("per_page");
		System.out.println(objperpage);
		Object objtotal = j.get("total");
		System.out.println(objtotal);
		Object objtotalpage = j.get("total_pages");
		System.out.println(objtotalpage);
		Object objectdata = j.get("data");
		JSONArray a = (JSONArray)objectdata;
		int k= a.size();
		System.out.println(k);
		for (int i = 0; i < a.size(); i++) {
			Object objectdata1 = a.get(i);
			JSONObject j1 = (JSONObject)objectdata1;
			System.out.println(j1.get("id"));
			System.out.println(j1.get("email"));
			System.out.println(j1.get("first_name"));
			System.out.println(j1.get("last_name"));
			System.out.println(j1.get("avatar"));
		}	
		
		JSONObject j2 = (JSONObject)obj;
		Object objectsupport =j2.get("support");
		System.out.println(objectsupport);
		Object ojecturl = j2.get("url");
		System.out.println(ojecturl);
		Object objecttext = j2.get("text");
		System.out.println(objecttext);
		
			
	}

}
