package com.mattan.testfragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



@SuppressLint("NewApi")
public class Fragment1 extends Fragment {



    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment1, vg,false);
    }
}
