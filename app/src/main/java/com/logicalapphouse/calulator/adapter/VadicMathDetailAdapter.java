package com.logicalapphouse.calulator.adapter;

import java.util.ArrayList;

import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.fragments.TableDetailFragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class VadicMathDetailAdapter extends BaseAdapter {
	private Activity activity = null;
	private Typeface condBold = null, condLight = null, condLightItalic = null;
	private ArrayList<String> tableList = null;

	public VadicMathDetailAdapter(Activity activity, ArrayList<String> tableList) {
		this.activity = activity;
		this.tableList = tableList;
		condBold = Typeface.createFromAsset(activity.getAssets(),
				"OpenSans-CondBold_0.ttf");
		condLight = Typeface.createFromAsset(activity.getAssets(),
				"OpenSans-CondLight.ttf");
		condLightItalic = Typeface.createFromAsset(activity.getAssets(),
				"OpenSans-CondLightItalic.ttf");
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
		String title  =null;
		title = tableList.get(arg0);
		if (title.contains("Example")||title.contains("Step")||title.contains("Steps")) {
			 
			if (convertview == null) {
				LayoutInflater inflater = (LayoutInflater) activity
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertview = inflater.inflate(R.layout.row_title_vadic_math,
						parent, false);
				viewHolder = new ViewHolder();
				viewHolder.text = (TextView) convertview
						.findViewById(R.id.title);

				convertview.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertview.getTag();
			}
			viewHolder.text.setTypeface(condBold);
			viewHolder.text.setTag(arg0);
			viewHolder.text.setText(title);
		} else {
			if (convertview == null) {
				LayoutInflater inflater = (LayoutInflater) activity
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertview = inflater.inflate(R.layout.row_vadic_math_table,
						parent, false);
				viewHolder = new ViewHolder();
				convertview.setTag(viewHolder);
			} else {
				viewHolder = (ViewHolder) convertview.getTag();
			}
			viewHolder.text = (TextView) convertview.findViewById(R.id.title);
			viewHolder.text.setTextColor(Color.WHITE);
			viewHolder.icon =(ImageView) convertview.findViewById(R.id.icon);
			viewHolder.text.setTypeface(condLightItalic);
			viewHolder.text.setTag(arg0);
			viewHolder.text.setText(title);
		}
		return convertview;
	}

	class ViewHolder {
		public TextView text;
		public ImageView icon;
	}
}