package com.spartacus.auxilo_v2.communication.data_container;

import java.util.List;
import java.util.Map;

import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;

public class JSONWrapper{
	
	@SuppressWarnings("rawtypes")
	static public boolean parseItemsfromJSON(String data){
		
		JsonParserFactory factory=JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map map_json_data = parser.parseJson(data);
		
		Map map_root = (Map) map_json_data.get("message");
		List list_items = (List) map_root.get("items");

		String item1_name=(String) ((Map)list_items.get(0)).get("name");
		String item2_name=(String) ((Map)list_items.get(1)).get("name");

		
		return true;
		/*
		Map rootJson = (Map) jsonData.get("root");
		List al = (List) rootJson.get("employees");
		
		@SuppressWarnings("unused")
		String fName = (String) ((Map)al.get(0)).get("firstName");
		String lName = (String) ((Map)al.get(0)).get("lastName");
		
		*/
	}
	
}
