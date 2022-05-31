package practise.api.pojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file=new File("C:\\Users\\WIN10\\eclipse-workspace\\APICLASS\\src\\test\\resources\\APIJSON\\listuseer.json");
	    ObjectMapper mapper = new ObjectMapper();
	   Class3pojoMO lu = mapper.readValue(file,Class3pojoMO.class);
	   int p = lu.getPage();
	   System.out.println(p);
	   int pp = lu.getPer_page();
	   System.out.println(pp);
	   int t = lu.getTotal();
	   System.out.println(t);
	   int tp = lu.getTotal_pages();
	   System.out.println(tp);
	   ArrayList<Class3pojodata> adata = lu.getData();
	   for(Class3pojodata pojodata : adata) {
		   System.out.println(pojodata.getId());
		   System.out.println(pojodata.getEmail());
		   System.out.println(pojodata.getFirst_name());
		   System.out.println(pojodata.getLast_name());
		   System.out.println(pojodata.getAvatar());
	   }
	   Class3pojoSupport s = lu.getSupport();
	   System.out.println(s.getUrl());
	   System.out.println(s.getText());
	}
	
}
