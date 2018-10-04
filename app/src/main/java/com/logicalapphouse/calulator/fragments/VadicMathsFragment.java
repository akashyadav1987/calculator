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
import com.logicalapphouse.calulator.adapter.VadicMathAdapter;

import java.util.ArrayList;

public class VadicMathsFragment extends CommonFragment {
	private ArrayList<String> exampleList =null;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view =inflater.inflate(R.layout.vadic_math_fragment,null);
		exampleList = new ArrayList<String>();
		exampleList.add("Subtraction");
		exampleList.add("Subtracting 2 Digit Numbers - Vedic Maths Tips and Tricks");
		exampleList.add("Tip on Cross Multiplication of Two Digit Numbers");
		exampleList.add("Multiplication");
		exampleList.add("Multiplication of 2 and 3 Digit Numbers - Vedic Maths Tips and Tricks");
		exampleList.add("Multiply by 9's");
		exampleList.add("Multiply with Base of 100");
		exampleList.add("Multiply by Nine's | Multiplicand and Multiplier Digits are Same");
		exampleList.add("Multiplication of Numbers Above the Base Number");
		exampleList.add("Multiplication of Numbers Below the Base Number");
		exampleList.add("Multiply Two Numbers using Vedic Maths Base Method");
		exampleList.add("Square");
		exampleList.add("Find Square of Three Digit Numbers");
		exampleList.add("Square a number by the Deficiency Sutra Method");
		exampleList.add("Fraction");
		exampleList.add("Ekadhikena Purvena in Converting Fractions to Decimals");
//		AdView mAdView = (AdView)view.findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("3B3F2DC204EF5DAB410E3B4A6378893B").build();
//        mAdView.loadAd(adRequest);
		//Banner banner = (Banner)view.findViewById(R.id.startAppBanner);
		ListView listView =(ListView) view.findViewById(R.id.vadic_math_example_list);
		VadicMathAdapter vadicmathAdapter =new VadicMathAdapter(getActivity(), exampleList);
		listView.setAdapter(vadicmathAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				if(pos!=0&&pos!=3&&pos!=11&&pos!=14){
				Fragment fragment =new VadicMathDetail();
				Bundle bundle =new Bundle();
				bundle.putInt("pos",pos);
				fragment.setArguments(bundle);
				((MainActivity)getActivity()).switchFragment(fragment);
				}
			}
		});
		return view;
	}

}
