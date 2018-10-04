package com.logicalapphouse.calulator.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.logicalapphouse.calculator.common.GlobalClass;
import com.logicalapphouse.calulator.MainActivity;
import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.model.ItemObjects;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.holder.AnimateViewHolder;

/**
 * Created by AkashYad on 4/30/2016.
 */
public class SolventRecyclerViewAdapter extends RecyclerView.Adapter<SolventRecyclerViewAdapter.SolventViewHolders> {

    private ArrayList<ItemObjects> itemList;
    private Typeface condBold = null, condLight = null, condLightItalic = null;
    private Activity context;

    public SolventRecyclerViewAdapter(Activity context, ArrayList<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
        condBold = Typeface.createFromAsset(context.getAssets(),
                "OpenSans-CondBold_0.ttf");
        condLight = Typeface.createFromAsset(context.getAssets(),
                "OpenSans-CondLight.ttf");
        condLightItalic = Typeface.createFromAsset(context.getAssets(),
                "OpenSans-CondLightItalic.ttf");
    }

    @Override
    public SolventViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.front_items, null);
        SolventViewHolders rcv = new SolventViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(SolventViewHolders holder, final int position) {
        try {
            switch (position){
                case 0:
                    holder.imageView.setBackgroundResource(R.drawable.m);
                    holder.imageView.setBackgroundColor(Color.parseColor("#80FF5733"));
                    break;
                case 1:
                    holder.imageView.setImageResource(R.drawable.m);
                    holder.imageView.setBackgroundColor(Color.parseColor("#8076C4DD"));
                    break;
                case 2:
                    break;
                case 3:
                    holder.imageView.setImageResource(R.drawable.m);
                    holder.imageView.setBackgroundColor(Color.parseColor("#806D6ECF"));
                    break;
                case 4:
                    holder.imageView.setImageResource(R.drawable.m);
                    holder.imageView.setBackgroundColor(Color.parseColor("#80CD2962"));
                    break;
                default:
                    holder.imageView.setImageResource(R.drawable.m);
                    holder.imageView.setBackgroundColor(Color.parseColor("#80C63232"));
                    break;
            }
            holder.name.setTypeface(condLightItalic);
            holder.name.setText(itemList.get(position).getName());
           // holder.imageView.setImageBitmap(itemList.get(position).getBitmap());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((MainActivity)GlobalClass.getInstance().activity).displayView(position);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
    public class SolventViewHolders extends AnimateViewHolder {

        public TextView name;
        public ImageView imageView;
        public CardView cardView;


        public SolventViewHolders(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.country_name);
            imageView = (ImageView) itemView.findViewById(R.id.photo);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }

        @Override
        public void animateAddImpl(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
            ViewCompat.animate(itemView)
                    .translationY(0)
                    .alpha(1)
                    .setDuration(300)
                    .setListener(viewPropertyAnimatorListener)
                    .start();
        }
        @Override
        public void preAnimateAddImpl() {
            ViewCompat.setTranslationY(itemView, -itemView.getHeight() * 0.3f);
            ViewCompat.setAlpha(itemView, 0);
        }
        @Override
        public void animateRemoveImpl(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
            ViewCompat.animate(itemView)
                    .translationY(-itemView.getHeight() * 0.3f)
                    .alpha(0)
                    .setDuration(300)
                    .setListener(viewPropertyAnimatorListener)
                    .start();
        }

    }
}
