package com.spartacus.auxilo_v2.gui_elements;


import com.spartacus.auxilo_v2.R;
import com.spartacus.auxilo_v2.gui_elements.FragmentSettings;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

public class FragmentSettings extends Fragment implements OnClickListener{

	View rootView_ = null;
	
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static FragmentSettings newInstance(int sectionNumber) {
		FragmentSettings fragment = new FragmentSettings();
		Bundle args = new Bundle();
		
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		
		return fragment;
	}

	public FragmentSettings() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_settings,
				container, false);
		
		rootView_ = rootView;
		
		//Default values:
		//((TextView)rootView_.findViewById(R.id.textView1)).setText("Fragment " + ARG_SECTION_NUMBER);
		
		//Listeners:
		rootView_.findViewById(R.id.button_change_log).setOnClickListener(this);
		
		return rootView;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		
		case R.id.button_change_log:
			
			Intent changelog = new Intent(getActivity(), ChangeLog.class);
			startActivity(changelog);
			
			break;

		default:
			break;
		}
		
	}
}

