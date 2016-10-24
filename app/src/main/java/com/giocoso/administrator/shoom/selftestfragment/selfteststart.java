package com.giocoso.administrator.shoom.selftestfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.giocoso.administrator.shoom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class selfteststart extends Fragment {

    ImageButton start_btn;


    public selfteststart() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_selfteststart, container, false);
        start_btn = (ImageButton) view.findViewById(R.id.startbtn);
        start_btn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_selftest, new selftestchecklist()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }

}
