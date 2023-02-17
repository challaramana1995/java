package automation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ForMAP1 {

	public static void main(String[] args) {
	Map<String, String>map = new HashMap<String,String>();
	//Map<String, String>map = new TreeMap<String,String>();
	//Map<String, String>map = new HashMap<String,String>();
	map.put("TestScript", "TCOO1");
	map.put("UserName", "Admin");
	map.put("password", "Admin123");
	System.err.println(map.get("UserName"));
	System.err.println(map);
	map.remove("possword");
	System.err.println(map);
	}

}
