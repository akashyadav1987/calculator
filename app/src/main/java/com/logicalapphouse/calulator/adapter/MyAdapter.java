package com.logicalapphouse.calulator.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.logicalapphouse.calculator.common.GlobalClass;
import com.logicalapphouse.calulator.MainActivity;
import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.model.ItemData;

import java.util.ArrayList;

/**
 * Created by Akashyadav on 30/05/16.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<ItemData> itemsData;
    private static final int TYPE_1=0;
    private static final int TYPE_2=1;
    private static final int TYPE_3=2;
    private static final int TYPE_4=3;
    private static final int TYPE_5=4;

    public MyAdapter(ArrayList<ItemData> itemsData) {
        this.itemsData = itemsData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        RecyclerView.ViewHolder viewHolder =null;
        switch (viewType){
            case 0:
                // create a new view
                View itemLayoutView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_row, null);
                // create ViewHolder
                 viewHolder = new ViewHolder(itemLayoutView);
                break;
            case 1:
                // create a new view
                View itemLayoutView1 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_row1, null);
                // create ViewHolder
                 viewHolder = new ViewHolderROW1(itemLayoutView1);
                break;
            case 2:
                // create a new view
                View itemLayoutView2 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_row2, null);
                // create ViewHolder
                viewHolder = new ViewHolderROW3(itemLayoutView2);
                break;

            case 3:
                // create a new view
                View itemLayoutView3 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_row3, null);
                // create ViewHolder
                viewHolder = new ViewHolderROW4(itemLayoutView3);
                break;

            case 4:
                // create a new view
                View itemLayoutView4 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_row4, null);
                // create ViewHolder
                viewHolder = new ViewHolderROW5(itemLayoutView4);
                break;

            default:
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder,  int position) {
        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData
        try {
            int viewType = getItemViewType(position);

            switch (viewType){
                case TYPE_1:
                    ItemData itemData = itemsData.get(position);
                    ((ViewHolder) holder).top_text.setTypeface(getFont(GlobalClass.getInstance().activity));
                    ((ViewHolder)holder).top_text.setTextColor(Color.parseColor("#ffffff"));
                    ((ViewHolder)holder).bottom_text.setText(itemData.getHeading());
                    ((ViewHolder)holder).bottom_text.setTypeface(getFont(GlobalClass.getInstance().activity));
                    ((ViewHolder)holder).bottom_text.setTextColor(Color.parseColor("#ffffff"));
                    Animation animation = AnimationUtils.loadAnimation(GlobalClass.getInstance().activity, R.anim.rotate);
                    animation.setRepeatMode(Animation.INFINITE);
                    ((ViewHolder)holder).imageView.startAnimation(animation);
                    break;
                case TYPE_2:
                    ItemData itemData1 = itemsData.get(position);
                    ViewHolderROW1 viewHolderROW1 = (ViewHolderROW1) holder;
                    viewHolderROW1.top_text.setTypeface(getFont(GlobalClass.getInstance().activity));
                    viewHolderROW1.top_text.setTextColor(Color.parseColor("#ffffff"));
                    ((ViewHolder) holder).bottom_text.setText(itemData1.getHeading());

                    break;
                case 2:
                    ItemData itemData2 = itemsData.get(position);
                    ((ViewHolder) holder).top_text.setTypeface(getFont(GlobalClass.getInstance().activity));
                    ((ViewHolder)holder).top_text.setTextColor(Color.parseColor("#ffffff"));
                    break;
                case 3:
                    ((ViewHolder) holder).top_text.setTypeface(getFont(GlobalClass.getInstance().activity));
                    ((ViewHolder)holder).top_text.setTextColor(Color.parseColor("#ffffff"));
                    break;
                case 4:
                    ((ViewHolder) holder).top_text.setTypeface(getFont(GlobalClass.getInstance().activity));
                    ((ViewHolder)holder).top_text.setTextColor(Color.parseColor("#ffffff"));
                    break;
                default:
                    break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemViewType(int position) {
        int type =0;
        switch (itemsData.get(position).getType()){
            case 0:
                type = TYPE_1;
                break;
            case 1:
                type = TYPE_2;
                break;
            case 2:
                type = TYPE_3;
                break;
            case 3:
                type = TYPE_4;
                break;
            case 4:
                type = TYPE_5;
                break;
        }
        return type;
    }



    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

       // public TextView txtViewTitle;
        public ImageView imgViewIcon;
        public TextView top_text,bottom_text;
        public CardView cardView;
        public ImageView imageView;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            //imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
            top_text = (TextView) itemLayoutView.findViewById(R.id.top_text);
            bottom_text = (TextView) itemLayoutView.findViewById(R.id.below_text);
            imageView = (ImageView) itemLayoutView.findViewById(R.id.main_image);
            cardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            ((MainActivity) GlobalClass.getInstance().activity).displayView(getAdapterPosition());
        }
    }
    public static class ViewHolderROW1 extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView top_text;
        public CardView cardView;
        public ViewHolderROW1(View itemLayoutView) {
            super(itemLayoutView);
            top_text = (TextView) itemLayoutView.findViewById(R.id.top_text);
            cardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            ((MainActivity) GlobalClass.getInstance().activity).displayView(getAdapterPosition());
        }
    }

    public static class ViewHolderROW3 extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView top_text;
        public CardView cardView;

        public ViewHolderROW3(View itemLayoutView) {
            super(itemLayoutView);
            top_text = (TextView) itemLayoutView.findViewById(R.id.top_text);
            cardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            ((MainActivity) GlobalClass.getInstance().activity).displayView(getAdapterPosition());
        }
    }
    public static class ViewHolderROW4 extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView top_text;
        public CardView cardView;

        public ViewHolderROW4(View itemLayoutView) {
            super(itemLayoutView);
            top_text = (TextView) itemLayoutView.findViewById(R.id.top_text);
            cardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            ((MainActivity) GlobalClass.getInstance().activity).displayView(getAdapterPosition());
        }
    }

    public static class ViewHolderROW5 extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView top_text;
        public CardView cardView;

        public ViewHolderROW5(View itemLayoutView) {
            super(itemLayoutView);
            top_text = (TextView) itemLayoutView.findViewById(R.id.top_text);
            cardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            ((MainActivity) GlobalClass.getInstance().activity).displayView(getAdapterPosition());

        }
    }
    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.size();
    }

    public static Typeface getFont(Context act) {
        Typeface customFont = Typeface.createFromAsset(act.getAssets(), "NeoGram-Medium.ttf");
        return customFont;
    }
}