package com.spartacus.auxilo_v2.communication.data_container;

import java.util.List;
import java.util.Map;

import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;

public class JSONWrapper{
	
	//Keywords:
	//=========
	
	//Root element:
	final static String Key_root = "message";
	
	//Metadata:
	final static String Key_customerID = "custID";
	final static String Key_target = "target";
	final static String Key_items = "items";
	
	//Items content:
	final static String Key_DevID = "DevID";
	final static String Key_name = "name";
	final static String Key_startTime = "startTime";
	final static String Key_endTime = "endTime";
	final static String Key_data = "data";
	
	@SuppressWarnings({ "rawtypes", "unused" })
	static public boolean parseItemsfromJSON(String json_data){
		
		//Init JSONParser:
		//================
		JsonParserFactory factory=JsonParserFactory.getInstance();
		JSONParser parser = factory.newJsonParser();
		Map map_json_data = parser.parseJson(json_data);
		
		Map map_root = (Map) map_json_data.get(Key_root);
		
		//Metadata:
		//============
		String customerID = (String) map_root.get(Key_customerID);
		String target = (String) map_root.get(Key_target);
		
		
		//Add items to container:
		//=======================
		
		List list_items = (List) map_root.get(Key_items);

		for (Object item_data : list_items) {
			
			String deviceID = (String) ((Map)item_data).get(Key_DevID);
			String item_name = (String) ((Map)item_data).get(Key_name);
			
			Item temp_item = new Item();
			temp_item.setDeviceID(deviceID);
			temp_item.setItemID(item_name);
			
			StaticItemContainer.addItem(temp_item);
		}
		
		/*
		String item1_name=(String) ((Map)list_items.get(0)).get("name");
		String item2_name=(String) ((Map)list_items.get(1)).get("name");
*/
		
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
