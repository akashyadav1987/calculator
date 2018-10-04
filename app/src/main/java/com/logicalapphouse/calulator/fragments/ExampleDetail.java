package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.logicalapphouse.calulator.R;

public class ExampleDetail extends CommonFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view =inflater.inflate(R.layout.example_detail,null);
		Bundle bundle =getArguments();
		Integer example_number  =	bundle.getInt("pos");
		return view;
	}
}
