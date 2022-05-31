package practise.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import practise.api.pojo.Class4ListUser;
import practise.api.pojo.Class4data;
import practise.api.pojo.Class4support;

public class LUMOWrite {
	public static void main(String[]args) throws StreamWriteException, DatabindException, IOException {
		File file = new File ("C:\\Users\\WIN10\\eclipse-workspace\\APICLASS\\src\\test\\resources\\APIJSON\\APIOUTPUT.json");
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Class4data> class2 =new ArrayList<Class4data>();
		Class4data c1 =new Class4data(7,"michael.lawson@reqres.in","Michael","Lawson","https://reqres.in/img/faces/7-image.jpg");
		Class4data c2=new Class4data(8,"lindsay.ferguson@reqres.in","Lindsay","Ferguson","https://reqres.in/img/faces/8-image.jpg");
		Class4data c3 =new Class4data(9,"tobias.funke@reqres.in","Tobias","Funke","https://reqres.in/img/faces/9-image.jpg");
		Class4data c4 =new Class4data(10,"byron.fields@reqres.in","Byron","Fields","https://reqres.in/img/faces/10-image.jpg");
		Class4data c5 =new Class4data(11,"george.edwards@reqres.in","George","Edwards","https://reqres.in/img/faces/11-image.jpg");
		Class4data c6 = new Class4data(12,"rachel.howell@reqres.in","Rachel","Howell","https://reqres.in/img/faces/12-image.jpg");
		class2.add(c1);
		class2.add(c2);
		class2.add(c3);
		class2.add(c4);
		class2.add(c5);
		class2.add(c6);
		Class4support class3 = new Class4support("https://reqres.in/#support-heading","To keep ReqRes free, contributions towards server costs are appreciated!");
		Class4ListUser root =new Class4ListUser(2,6,12,2,class2,class3);
		mapper.writeValue(file,root );
		
	}
	

}
