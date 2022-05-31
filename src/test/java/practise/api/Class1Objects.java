
package practise.api;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Class1Objects {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader=new FileReader("C:\\Users\\WIN10\\eclipse-workspace\\APICLASS\\src\\test\\resources\\APIJSON\\Basicfile.json");
		JSONParser jsonparser = new JSONParser();
		Object obj=jsonparser.parse(reader);
		JSONObject jo = (JSONObject)obj;
		Object objdata= jo.get("data");
		System.out.println(objdata);
		System.out.println("kiki");
        System.out.println("ramesh");
        System.out.println("berlin");

		Object objsupport = jo.get("support");
		System.out.println(objsupport);
		
		JSONObject jdata = (JSONObject)objdata;
		Object id =jdata.get("id");
		System.out.println(id);
		
		Object email =jdata.get("email");
		System.out.println(email);
		
		Object first_name =jdata.get("first_name");
		System.out.println(first_name);
		
		Object last_name =jdata.get("last_name");
		System.out.println(last_name);
		
		Object avatar =jdata.get("avatar");
		System.out.println(avatar);
		
		JSONObject jsupport = (JSONObject)objsupport;
		Object url =jsupport.get("url");
		System.out.println(url);
		
		Object text =jsupport.get("text");
		System.out.println(text);
		
		
		
	}

}
