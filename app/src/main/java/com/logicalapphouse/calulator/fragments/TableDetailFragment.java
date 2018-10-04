package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.adapter.TableDetailAdapter;


public class TableDetailFragment extends CommonFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.list, null);
		Bundle bundle =getArguments();
	    Integer number  =	bundle.getInt("number");
	    RecyclerView listView  = view.findViewById(R.id.table_detail);
	    Log.e("aaa", "aaaaa");
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
	//	Banner banner = (Banner)view.findViewById(R.id.startAppBanner);
		listView.setLayoutManager(linearLayoutManager);

//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("3B3F2DC204EF5DAB410E3B4A6378893B").build();
//
//		adRequest.showAd(); // show the ad
//		adRequest.loadAd(); // load the next ad
	    TableDetailAdapter tableDetailAdapter =new TableDetailAdapter(getActivity(), number);
	    //listView.setAdapter(tableDetailAdapter);
		listView.setAdapter(tableDetailAdapter);
		return view;
	}
	

}
