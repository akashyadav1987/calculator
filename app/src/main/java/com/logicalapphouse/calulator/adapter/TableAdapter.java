package com.logicalapphouse.calulator.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.logicalapphouse.calulator.R;

import java.util.ArrayList;

public class TableAdapter extends BaseAdapter {
	private Activity activity=null;
	private Typeface condBold=null,condLight=null,condLightItalic=null;
	private ArrayList<String> tableList=null;
	public TableAdapter(Activity activity ,ArrayList<String> tableList){
		this.activity =activity;
		this.tableList =tableList;
		condBold = Typeface.createFromAsset(activity.getAssets(), "OpenSans-CondBold_0.ttf");
		condLight = Typeface.createFromAsset(activity.getAssets(), "OpenSans-CondLight.ttf");
		condLightItalic = Typeface.createFromAsset(activity.getAssets(), "OpenSans-CondLightItalic.ttf");
	}

	@Override
	public int getCount() {
		return tableList.size();
	}

	@Override
	public Object getItem(int arg0) {
		return tableList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View convertview, ViewGroup parent) {
		ViewHolder viewHolder = null;
		
		if(convertview ==null){
			 LayoutInflater inflater = (LayoutInflater) activity
				        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			        convertview = inflater.inflate(R.layout.row_table, parent, false);
				    viewHolder =new ViewHolder();
			viewHolder.text = (TextView)convertview.findViewById(R.id.title);
			convertview.setTag(viewHolder);
		}else{
			viewHolder =(ViewHolder)convertview.getTag();
		}
		String title =tableList.get(arg0);
		viewHolder.text.setTypeface(condBold);
		viewHolder.text.setTag(arg0);
		viewHolder.text.setText(title);
		return convertview;
	}
	
	class ViewHolder{
		public TextView text;
	}
}