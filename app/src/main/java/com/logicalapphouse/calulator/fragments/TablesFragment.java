package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.logicalapphouse.calulator.MainActivity;
import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.adapter.TableAdapter;

import java.util.ArrayList;

public class TablesFragment extends CommonFragment{
    private ArrayList<String> tableList =null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view =inflater.inflate(R.layout.tables_fragment,null);
//		AdView mAdView = (AdView)view. findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("3B3F2DC204EF5DAB410E3B4A6378893B").build();
//        mAdView.loadAd(adRequest);
		tableList = new ArrayList<String>();
		tableList.add("1's - Table");
		tableList.add("2's - Table");
		tableList.add("3's - Table");
		tableList.add("4's - Table");
		tableList.add("5's - Table");
		tableList.add("6's - Table");
		tableList.add("7's - Table");
		tableList.add("8's - Table");
		tableList.add("9's - Table");
		tableList.add("10's - Table");
		tableList.add("11's - Table");
		tableList.add("12's - Table");
		tableList.add("13's - Table");
		tableList.add("14's - Table");
		tableList.add("15's - Table");
		tableList.add("16's - Table");
		tableList.add("17's - Table");
		tableList.add("18's - Table");
		tableList.add("19's - Table");
		tableList.add("20's - Table");
		tableList.add("21's - Table");
		tableList.add("22's - Table");
		tableList.add("23's - Table");
		tableList.add("24's - Table");
		tableList.add("25's - Table");
		tableList.add("26's - Table");
		tableList.add("27's - Table");
		tableList.add("28's - Table");
		tableList.add("29's - Table");
		tableList.add("30's - Table");
		tableList.add("31's - Table");
		tableList.add("32's - Table");
		tableList.add("33's - Table");
		tableList.add("34's - Table");
		tableList.add("35's - Table");
		tableList.add("36's - Table");
		tableList.add("37's - Table");
		tableList.add("38's - Table");
		tableList.add("39's - Table");
		tableList.add("40's - Table");
		tableList.add("41's - Table");
		tableList.add("42's - Table");
		tableList.add("43's - Table");
		tableList.add("44's - Table");
		tableList.add("45's - Table");
		tableList.add("46's - Table");
		tableList.add("47's - Table");
		tableList.add("48's - Table");
		tableList.add("49's - Table");
		tableList.add("50's - Table");
		tableList.add("51's - Table");
		tableList.add("52's - Table");
		tableList.add("53's - Table");
		tableList.add("54's - Table");
		tableList.add("55's - Table");
		tableList.add("56's - Table");
		tableList.add("57's - Table");
		tableList.add("58's - Table");
		tableList.add("59's - Table");
		tableList.add("60's - Table");
		tableList.add("61's - Table");
		tableList.add("62's - Table");
		tableList.add("63's - Table");
		tableList.add("64's - Table");
		tableList.add("65's - Table");
		tableList.add("66's - Table");
		tableList.add("67's - Table");
		tableList.add("68's - Table");
		tableList.add("69's - Table");
		tableList.add("70's - Table");
		tableList.add("71's - Table");
		tableList.add("72's - Table");
		tableList.add("73's - Table");
		tableList.add("74's - Table");
		tableList.add("75's - Table");
		tableList.add("76's - Table");
		tableList.add("77's - Table");
		tableList.add("78's - Table");
		tableList.add("79's - Table");
		tableList.add("80's - Table");
		tableList.add("81's - Table");
		tableList.add("82's - Table");
		tableList.add("83's - Table");
		tableList.add("84's - Table");
		tableList.add("85's - Table");
		tableList.add("86's - Table");
		tableList.add("87's - Table");
		tableList.add("88's - Table");
		tableList.add("89's - Table");
		tableList.add("90's - Table");
		tableList.add("91's - Table");
		tableList.add("92's - Table");
		tableList.add("93's - Table");
		tableList.add("94's - Table");
		tableList.add("95's - Table");
		tableList.add("96's - Table");
		tableList.add("97's - Table");
		tableList.add("98's - Table");
		tableList.add("99's - Table");
		tableList.add("100's - Table");
		
		ListView listView =(ListView) view.findViewById(R.id.table_list);
		TableAdapter tableAdapter =new TableAdapter(getActivity(), tableList);
		listView.setAdapter(tableAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int number,
					long arg3) {
			
					Fragment fragment =new TableDetailFragment();
					Bundle bundle =new Bundle();
					bundle.putInt("number",++number);
					fragment.setArguments(bundle);
					((MainActivity)getActivity()).switchFragment(fragment);
				
			}
		});
		return view;
	}

}
