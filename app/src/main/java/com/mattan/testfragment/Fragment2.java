package com.mattan.testfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment2, vg,false);

    }
}
