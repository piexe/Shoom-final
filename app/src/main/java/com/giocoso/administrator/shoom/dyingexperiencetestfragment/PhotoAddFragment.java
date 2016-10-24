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
public class PhotoAddFragment extends Fragment {

    ImageButton addphoto_button;

    public PhotoAddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo_add, container, false);

        addphoto_button = (ImageButton)view.findViewById(R.id.addphoto);

        addphoto_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_dying_experience_test, new PhotoSelect()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });


        return view;
    }

}
