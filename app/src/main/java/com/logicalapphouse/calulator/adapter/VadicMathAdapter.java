package com.logicalapphouse.calulator.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.logicalapphouse.calulator.R;

import java.util.ArrayList;

public class VadicMathAdapter extends BaseAdapter {
	private Activity activity = null;
	private Typeface condBold = null, condLight = null, condLightItalic = null;
	private ArrayList<String> tableList = null;

	public VadicMathAdapter(Activity activity, ArrayList<String> tableList) {
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
		try {
			ViewHolder viewHolder = null;
			String title = null;
			title = tableList.get(arg0);
			if (arg0 == 0 || arg0 == 3 || arg0 == 11 || arg0 == 14) {

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
				viewHolder.icon = (ImageView) convertview.findViewById(R.id.icon);
				viewHolder.icon.setVisibility(View.VISIBLE);
				viewHolder.text.setTypeface(condLightItalic);
				viewHolder.text.setTag(arg0);
				viewHolder.text.setText(title);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return convertview;
	}

	class ViewHolder {
		public TextView text;
		public ImageView icon;
	}
}