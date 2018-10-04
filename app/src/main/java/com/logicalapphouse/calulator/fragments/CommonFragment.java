package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.logicalapphouse.calculator.common.GlobalClass;

/**
 * Created by AkashYad on 5/1/2016.
 */
public class CommonFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onRefresh() {
        if (GlobalClass.getInstance().background != null) {
            try {
               // GlobalClass.getInstance().background  = (ImageView) getActivity().findViewById(R.id.back);
                //GlobalClass.getInstance().background.setBackgroundColor(getResources().getColor(R.color.chat_gray));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
