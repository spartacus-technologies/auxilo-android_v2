package com.spartacus.auxilo_v2.communication.data_container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class StaticDataContainer {

	static Map<String, Device> devices = null;
	
	public static boolean addItem(Item item){
		
		//Create map if not present:
		if(devices == null){
			
			devices = new HashMap<String, Device>();
		}

		//Create device if not present:
		if(devices.get(item.getDeviceID()) == null){
			
			devices.put(item.getDeviceID(), new Device(item.getDeviceID()));
		}
		
		if(devices.get(item.getDeviceID()).addItem(item)) 
			
			return true;

		return false;
	}
	
	public static Set<String> getDeviceNames(){
		
		return devices.keySet();
	}
	
	public static Map<String, Item> getItems(String deviceName){
		
		Map<String, Device> devices_test = devices;
		return devices.get(deviceName).items_;
	}
}
