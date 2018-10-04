package com.logicalapphouse.calulator.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.logicalapphouse.calulator.R;

public class TableDetailAdapter extends RecyclerView.Adapter<TableDetailAdapter.MyHolder> {
	private Activity activity=null;
	private Typeface condBold=null,condLight=null,condLightItalic=null;
	private static final int DEFAULT_LISTIZE=10;
	private int number=0;
	private int variable =1;
	public TableDetailAdapter(Activity activity ,int number){
		this.activity =activity;
		this.number =number;
		condBold = Typeface.createFromAsset(activity.getAssets(), "OpenSans-CondBold_0.ttf");
		condLight = Typeface.createFromAsset(activity.getAssets(), "OpenSans-CondLight.ttf");
		condLightItalic = Typeface.createFromAsset(activity.getAssets(), "OpenSans-CondLightItalic.ttf");
	}


	@Override
	public TableDetailAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		LayoutInflater inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	View convertview = inflater.inflate(R.layout.row_table_detail, parent, false);
	return  new TableDetailAdapter.MyHolder(convertview);
	}


	@Override
	public void onBindViewHolder(MyHolder holder, int position) {
		try{
			holder.text.setTypeface(condBold);
			holder.text.setTag(position);
			holder.text.setText(String.valueOf(number));

			holder.variable.setTypeface(condBold);
			holder.variable.setTag(position);
			holder.variable.setText(String.valueOf(variable));

			int result  = number*variable;
			holder.result.setTypeface(condBold);
			holder.result.setTag(position);
			holder.result.setText(String.valueOf(result));

			variable = variable+1;

		}catch (Exception e){

		}
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public int getItemCount() {
		return DEFAULT_LISTIZE;
	}


	
	public static class MyHolder extends RecyclerView.ViewHolder{
		public TextView text;
		public TextView variable;
		public TextView result;

		public MyHolder(View itemView) {
			super(itemView);
			text = itemView.findViewById(R.id.number);
			variable = itemView.findViewById(R.id.variable);
			result = itemView.findViewById(R.id.result);
		}
	}
}