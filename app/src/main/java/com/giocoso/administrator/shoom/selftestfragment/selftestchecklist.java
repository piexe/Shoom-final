package com.giocoso.administrator.shoom.selftestfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.giocoso.administrator.shoom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class selftestchecklist extends Fragment {


    public selftestchecklist() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selftestchecklist, container, false);
    }

}
