package com.spartacus.auxilo_v2.communication.data_container;

import java.util.List;
import java.util.Map;

import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;

public class JSONWrapper{
	
	static Item parseJSON(String data){
		
		JsonParserFactory factory=JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map jsonData = parser.parseJson(data);

		Map rootJson = (Map) jsonData.get("root");
		List al = (List) rootJson.get("employees");
		
		String fName = (String) ((Map)al.get(0)).get("firstName");
		String lName = (String) ((Map)al.get(0)).get("lastName");
		return null;
	}
	
}
