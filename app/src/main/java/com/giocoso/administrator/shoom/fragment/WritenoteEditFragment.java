package com.giocoso.administrator.shoom.fragment;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import com.giocoso.administrator.shoom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WritenoteEditFragment extends Fragment {

    EditText edMemo;
    ImageButton move_framgment_button2;
    public WritenoteEditFragment() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_writenote_edit, container, false);
        //툴바 버튼 지우기

        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

    edMemo = (EditText) view.findViewById(R.id.memoBody);
        move_framgment_button2 = (ImageButton)view.findViewById(R.id.move_frament_button2);

        move_framgment_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_dying_experience_test, new PhotoAddFragment()
                ).setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
    // 레이아웃에서 호출(화면에 줄긋기)
    public class LineEditText extends EditText {
        private Rect mRect;
        private Paint mPaint;

        int initialCount = 0;

        public LineEditText(Context context, AttributeSet attrs) {
            super(context, attrs);

            mRect = new Rect();
            mPaint = new Paint();
            mPaint.setStyle(Paint.Style.FILL);
            mPaint.setColor(Color.BLUE);
            initialCount = getMinLines();
            setLines(initialCount);

        }

        @Override
        protected void onDraw(Canvas canvas) {

            // Gets the number of lines of text in the View.
            int count = getBaseline();
            // Gets the global Rectangle and Paint objects
            Rect r = mRect;
            Paint paint = mPaint;
            // Gets the baseline coordinates for the current line of text
            int baseline = getLineBounds(0, r);
            // Draws one line in the rectangle for every line of text in the EditText
            for (int i = 0; i < count; i++) {
            /*
             * Draws a line in the background from the left of the rectangle to the
             * right, at a vertical position one dip below the baseline, using the
             * "paint" object for details.
             */
                canvas.drawLine(r.left, baseline + 1, r.right, baseline + 1, paint);
                baseline += getLineHeight();//next line
            }

            // Finishes up by calling the parent method
            super.onDraw(canvas);
        }
    }
}


