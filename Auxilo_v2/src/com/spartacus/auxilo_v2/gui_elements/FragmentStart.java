package com.spartacus.auxilo_v2.gui_elements;

import com.spartacus.auxilo_v2.R;
import com.spartacus.auxilo_v2.gui_elements.FragmentStart;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

public class FragmentStart extends Fragment {

	View rootView_ = null;
	
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static FragmentStart newInstance(int sectionNumber) {
		FragmentStart fragment = new FragmentStart();
		Bundle args = new Bundle();
		
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}

	public FragmentStart() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_start,
				container, false);
		
		rootView_ = rootView;
		
		//Default values:
		//((TextView)rootView_.findViewById(R.id.textView1)).setText("Fragment " + ARG_SECTION_NUMBER);
		
		return rootView;
	}
}

