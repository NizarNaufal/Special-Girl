package com.nizar.specialgirl.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nizar.specialgirl.R;

public class diduainFragment extends Fragment {

    public static diduainFragment newInstance()
    {
        diduainFragment diduainFragment=new diduainFragment();

        return diduainFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_diduain,null);
        return rootView;
    }


    @Override
    public String toString() {
        return "diduainFragment";
    }
}