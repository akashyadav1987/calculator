package com.logicalapphouse.calculator.common;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.widget.ImageView;

import com.logicalapphouse.calulator.fragments.CommonFragment;

import cpom.logicalapphouse.calculator.pref.Pref;

public class GlobalClass {
private static GlobalClass globalClass=null;
public Pref pref;
public ActionBar actionBar;
public Activity activity;
	public CommonFragment fragment;
	public ImageView background;
public static GlobalClass getInstance(){
	if(globalClass ==null){
		globalClass =new GlobalClass();
		return globalClass;
	}
	return globalClass;
}
}
