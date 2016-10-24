package com.giocoso.administrator.shoom.dyingexperiencetestfragment;


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
public class PhotoSelect extends Fragment {

    ImageButton move_frament_button2;

    public PhotoSelect() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo_select, container, false);

        move_frament_button2 = (ImageButton)view.findViewById(R.id.move_frament_button2);

        move_frament_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_dying_experience_test, new VideoFragment()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }

}
