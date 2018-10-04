package com.logicalapphouse.calulator.fragments;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.logicalapphouse.calculator.Widget.ColorPicker;
import com.logicalapphouse.calculator.Widget.ColorPicker.OnColorChangedListener;
import com.logicalapphouse.calculator.Widget.OpacityBar;
import com.logicalapphouse.calculator.Widget.SVBar;
import com.logicalapphouse.calculator.Widget.SaturationBar;
import com.logicalapphouse.calculator.Widget.SaturationBar.OnSaturationChangedListener;
import com.logicalapphouse.calculator.Widget.ValueBar;
import com.logicalapphouse.calculator.Widget.ValueBar.OnValueChangedListener;
import com.logicalapphouse.calculator.common.GlobalClass;
import com.logicalapphouse.calulator.R;

public class ThemeFragment extends CommonFragment implements OnColorChangedListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view =inflater.inflate(R.layout.theme_fragment, null);
//		AdView mAdView = (AdView)view. findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().addTestDevice("3B3F2DC204EF5DAB410E3B4A6378893B").build();
//        mAdView.loadAd(adRequest);
//		Banner banner = (com.startapp.android.publish.banner.Banner)view.findViewById(R.id.startAppBanner);
		//GlobalClass.getInstance().startAppAd.loadAd(StartAppAd.AdMode.REWARDED_VIDEO);
		ColorPicker picker = (ColorPicker)view. findViewById(R.id.picker);
		picker.setColor(getActivity().getResources().getColor(R.color.dark_pinksih));
		SVBar svBar = (SVBar)view. findViewById(R.id.svbar);
		SaturationBar saturationBar = (SaturationBar)view. findViewById(R.id.saturationbar);
		ValueBar valueBar = (ValueBar)view. findViewById(R.id.valuebar);
        OpacityBar opacityBar =(OpacityBar) view.findViewById(R.id.opecityBar);
		picker.addSVBar(svBar);
		picker.addOpacityBar(opacityBar);
		picker.addSaturationBar(saturationBar);
		picker.addValueBar(valueBar);
		
		//To get the color
		picker.getColor();

		//To set the old selected color u can do it like this
		picker.setOldCenterColor(picker.getColor());
		// adds listener to the colorpicker which is implemented
		//in the activity
		picker.setOnColorChangedListener(this);

		//to turn of showing the old color
		picker.setShowOldCenterColor(false);

		//adding onChangeListeners to bars
		valueBar.setOnValueChangedListener(new OnValueChangedListener() {
			
			@Override
			public void onValueChanged(int value) {
				// TODO Auto-generated method stub
				
			}
		});
		
		saturationBar.setOnSaturationChangedListener(new OnSaturationChangedListener() {
			
			@Override
			public void onSaturationChanged(int saturation) {
				// TODO Auto-generated method stub
				
			}
		});
		return view;
	}

	@Override
	public void onColorChanged(final int color) {
	
		GlobalClass.getInstance().pref.saveColorCode(color);
		new Handler().post(new Runnable() {
			
			@Override
			public void run() {
				GlobalClass.getInstance().actionBar.setBackgroundDrawable(new ColorDrawable(color));
				GlobalClass.getInstance().actionBar.setDisplayShowTitleEnabled(false);
				GlobalClass.getInstance().actionBar.setDisplayShowTitleEnabled(true);
				try{
					GlobalClass.getInstance().fragment.onRefresh();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		

	}
	

}
