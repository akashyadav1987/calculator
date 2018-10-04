package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import com.logicalapphouse.calulator.R;
import com.logicalapphouse.calulator.SpacesItemDecoration;
import com.logicalapphouse.calulator.adapter.MyAdapter;
import com.logicalapphouse.calulator.model.ItemData;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

/**
 * Created by AkashYad on 4/30/2016.
 */
public class FrontMenuScreen extends CommonFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.front_menu_screen,null);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.front_menu_items);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        recyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
        recyclerView.setItemAnimator(new SlideInUpAnimator(new OvershootInterpolator(1f)));
        recyclerView.getItemAnimator().setAddDuration(1000);

        SlideInLeftAnimator animator = new SlideInLeftAnimator();
      //  animator.setInterpolator(new OvershootInterpolator());
// or recyclerView.setItemAnimator(new SlideInUpAnimator(new OvershootInterpolator(1f));
        recyclerView.setItemAnimator(animator);
        recyclerView.setHasFixedSize(true);
        setHasOptionsMenu(false);
        GridLayoutManager gaggeredGridLayoutManager = new GridLayoutManager(getActivity(),1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        ArrayList<ItemData> staggeredList = new ArrayList<ItemData>();
        ItemData itemObjects = new ItemData();
        itemObjects.setType(0);
        itemObjects.setHeading("Calculator");
       // itemObjects.setName("Calculator");
        //itemObjects.setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.main_screen_calc));
        staggeredList.add(itemObjects);


        ItemData itemObjects1 = new ItemData();
        itemObjects1.setType(1);
        itemObjects1.setHeading("Mathematical tables");
       // itemObjects1.setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.table));
        staggeredList.add(itemObjects1);

        ItemData itemObjects2 = new ItemData();
        itemObjects2.setType(2);
       // itemObjects2.setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.main_maths));
        staggeredList.add(itemObjects2);

        ItemData itemObjects3 = new ItemData();
        itemObjects3.setType(3);
        staggeredList.add(itemObjects3);

        ItemData itemObjects4 = new ItemData();
        itemObjects4.setType(4);
       // itemObjects4.setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.main_screen_theme));
        staggeredList.add(itemObjects4);

        MyAdapter rcAdapter = new MyAdapter(staggeredList);

        recyclerView.setAdapter(rcAdapter);
        return view;
    }
}
