package com.spartacus.auxilo_v2.communication.data_container;

import java.util.HashMap;
import java.util.Map;

public class Device {

	String deviceName_;
	
	Map<String, Item> items_;
	
	Device(String deviceName){
		
		deviceName_ = deviceName;
	}
	
	boolean addItem(Item item){
		
		if(items_ == null) items_ = new HashMap<String, Item>();
		
		if(item.getDeviceID().equals(deviceName_)){
			
			items_.put(item.getItemID(), item);
			return true;
		}
		
		return false;
	}
	
	Map<String, Item> getItems(){
		
		return items_;
	}
}
