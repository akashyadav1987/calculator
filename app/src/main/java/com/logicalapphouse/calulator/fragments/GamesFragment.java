package com.logicalapphouse.calulator.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.logicalapphouse.calulator.R;

/**
 * Created by akashyadav on 8/12/18.
 */

public class GamesFragment extends CommonFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_games,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView guessResult = view.findViewById(R.id.result);
        Animation anim= AnimationUtils.loadAnimation(getActivity(), R.anim.translate_button);
        guessResult.startAnimation(anim);
    }

   // private void gerateRando
}
