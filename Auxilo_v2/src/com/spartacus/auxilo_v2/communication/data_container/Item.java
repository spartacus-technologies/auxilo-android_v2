package com.spartacus.auxilo_v2.communication.data_container;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item {
	
	public class DataPoint{
			
		public Date timestamp;
		public float data;
		
		DataPoint(Date ts, float data_){
			
			timestamp = ts;
			data = data_;
		}
	}
	
	boolean isControllable = false;
	String DeviceID = null;
	boolean isLocal = false;
	String itemID = null;

	List<DataPoint> data;
	
	Item(){
		
		data = new ArrayList<DataPoint>();
	}
	
	Item (String JSONdata){
		
		data = new ArrayList<DataPoint>();
	}
	
	public boolean isControllable() {
		
		return isControllable;
	}

	public void setControllable(boolean isControllable) {
		
		this.isControllable = isControllable;
	}

	public String getDeviceID() {
		
		return DeviceID;
	}

	public void setDeviceID(String deviceID) {
		
		DeviceID = deviceID;
	}

	public boolean isLocal() {
		
		return isLocal;
	}

	public void setLocal(boolean isLocal) {
		
		this.isLocal = isLocal;
	}

	public String getItemID() {
		
		return itemID;
	}

	public void setItemID(String itemID) {
		
		this.itemID = itemID;
	}

	
	public List<DataPoint> getData() {
		return data;
	}

	public void setData(List<DataPoint> data) {
		this.data = data;
	}

}
