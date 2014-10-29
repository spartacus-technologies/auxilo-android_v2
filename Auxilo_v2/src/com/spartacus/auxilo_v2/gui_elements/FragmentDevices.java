package com.spartacus.auxilo_v2.gui_elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.spartacus.auxilo_v2.R;
import com.spartacus.auxilo_v2.communication.data_container.Item;
import com.spartacus.auxilo_v2.communication.data_container.StaticDataContainer;
import com.spartacus.auxilo_v2.gui_elements.FragmentDevices;
import com.spartacus.auxilo_v2.gui_elements.ExpandableList.ExpandableListAdapter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ExpandableListView;
import android.widget.TextView;

//http://www.androidhive.info/2013/07/android-expandable-list-view-tutorial/

public class FragmentDevices extends Fragment {

	View rootView_ = null;
	
	ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
	
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static FragmentDevices newInstance(int sectionNumber) {
		FragmentDevices fragment = new FragmentDevices();
		Bundle args = new Bundle();
		
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}

	public FragmentDevices() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_devices,
				container, false);
		
		rootView_ = rootView;
		
		//ListView:
		//=========
        expListView = (ExpandableListView) rootView.findViewById(R.id.listViewItems);
        prepareListData();
        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
		
		//Default values:
		//((TextView)rootView_.findViewById(R.id.textView1)).setText("Fragment " + ARG_SECTION_NUMBER);
		
		return rootView;
	}
	
	/*
     * Preparing the list data
     */
    private void prepareListData() {
    	
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        //TODO:
        
        for (String dev_name : StaticDataContainer.getDeviceNames()) {
			
        	listDataHeader.add(dev_name);
		}

        //Add devices to header list:
        for (String deviceName : StaticDataContainer.getDeviceNames()) {
        	
        	List<String> devices = new ArrayList<String>();
        	
        	//Add device to devicelist:
        	for (String itemname : StaticDataContainer.getItems(deviceName).keySet()) {
        		
        		devices.add(itemname);
        	}
        	listDataChild.put(deviceName, devices); // Header, Child data
		}
        
        
        
        /*
        listDataChild.put(listDataHeader.get(0), Nexus); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Nexus); // Header, Child data
        */

    }
}

