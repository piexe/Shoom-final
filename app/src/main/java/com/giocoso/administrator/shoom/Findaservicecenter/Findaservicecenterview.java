package com.giocoso.administrator.shoom.findaservicecenter;

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
public class findaservicecenterview extends Fragment {

    ImageButton imageButton1, imageButton2, imageButton3, imageButton4;


    public findaservicecenterview() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_findaservicecenterview, container, false);
        imageButton1 = (ImageButton) view.findViewById(R.id.imageButton1);

        imageButton2 = (ImageButton) view.findViewById(R.id.imageButton2);

        imageButton3 = (ImageButton) view.findViewById(R.id.imageButton3);

        imageButton4 = (ImageButton) view.findViewById(R.id.imageButton4);
        imageButton1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_findaservicecenter, new findaservicentercall()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });
        imageButton2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_findaservicecenter, new findaservicentercall()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });
        imageButton3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_findaservicecenter, new findaservicentercall()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });
        imageButton4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_findaservicecenter, new findaservicentercall()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }

}
